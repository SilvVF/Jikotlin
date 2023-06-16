package io.silv.jikotlin.params

sealed class QueryParam(
    val paramName: String,
    open val paramValue: String
) {

    companion object {

        private fun StringBuilder.appendParam(name: String, value: String) {
            append(name)
            append('=')
            append(value)
        }

        fun buildUrl(baseUrl: String, queryParams: List<QueryParam?>): String {
            return buildUrl(baseUrl, queryParams.filterNotNull())
        }

        fun buildUrl(baseUrl: String, queryParams: List<QueryParam>): String {

            val url = StringBuilder(baseUrl)

            queryParams.forEachIndexed { index, queryParam ->
                if(index == 0) {
                    url.append('?')
                    url.appendParam(queryParam.paramName, queryParam.paramValue)
                } else {
                    url.append('&')
                    url.appendParam(queryParam.paramName, queryParam.paramValue)
                }
            }

            return url.toString()
        }
    }
}