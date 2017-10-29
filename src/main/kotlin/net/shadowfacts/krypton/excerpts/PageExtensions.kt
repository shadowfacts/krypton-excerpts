package net.shadowfacts.krypton.excerpts

import net.shadowfacts.krypton.Page
import net.shadowfacts.krypton.excerpts.config.excerptEnd
import net.shadowfacts.krypton.excerpts.config.excerptStart

/**
 * @author shadowfacts
 */
val Page.excerpt: String
	get() {
		return input.split(krypton.config.excerptStart)[1].split(krypton.config.excerptEnd)[0]
	}