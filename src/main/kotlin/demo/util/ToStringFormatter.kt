package demo.util

import org.apache.commons.lang3.builder.ToStringBuilder
import org.apache.commons.lang3.builder.ToStringStyle
import org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE

inline fun <reified T : Any> formatToString(obj: T, style: ToStringStyle = SHORT_PREFIX_STYLE): String =
        ToStringBuilder.reflectionToString(obj, style)
