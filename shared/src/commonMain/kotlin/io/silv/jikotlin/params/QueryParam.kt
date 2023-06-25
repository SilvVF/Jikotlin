package io.silv.jikotlin.params

abstract class QueryParam(
    open val name: String,
    open val value: String

) {
    companion object {

        private fun StringBuilder.appendParam(name: String, value: String) {
            append(name)
            append('=')
            append(value)
        }


        fun buildUrl(baseUrl: String, queryParams: List<QueryParam?>): String {

            val url = StringBuilder(baseUrl)

            queryParams.filterNotNull().forEachIndexed { index, queryParam ->
                if(index == 0) {
                    url.append('?')
                    url.appendParam(queryParam.name, queryParam.value)
                } else {
                    url.append('&')
                    url.appendParam(queryParam.name, queryParam.value)
                }
            }

            return url.toString()
        }
    }
}