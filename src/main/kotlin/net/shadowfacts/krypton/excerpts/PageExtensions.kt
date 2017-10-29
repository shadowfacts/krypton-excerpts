package net.shadowfacts.krypton.excerpts

import net.shadowfacts.krypton.Page
import net.shadowfacts.krypton.excerpts.config.excerptDelimiter

/**
 * @author shadowfacts
 */
val Page.excerpt: String
	get() = krypton.config.excerptDelimiter.split(input).filter(String::isNotBlank)[0]