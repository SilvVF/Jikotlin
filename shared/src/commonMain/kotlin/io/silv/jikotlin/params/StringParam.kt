package io.silv.jikotlin.params


data class StringParam(val name: String,val param: String): QueryParam(name, param) {
    companion object {
        fun get(name: String, param: Any?): StringParam? {
            return if (param != null) {
                StringParam(name, param.toString())
            } else {
                null
            }
        }
    }
}
