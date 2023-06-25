package io.silv.jikotlin.params


data class StringParam(
    override val name: String,
    override val value: String
): QueryParam(name, value) {

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
