package net.shadowfacts.krypton.excerpts.config

import net.shadowfacts.krypton.config.Configuration
import net.shadowfacts.krypton.config.config

/**
 * @author shadowfacts
 */
var Configuration.excerptStart: String by config({ it }, fallback = { "<!-- start excerpt -->" })
var Configuration.excerptEnd: String by config({ it }, fallback = { "<!-- end excerpt -->" })