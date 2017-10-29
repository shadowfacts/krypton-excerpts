package net.shadowfacts.krypton.excerpts.config

import net.shadowfacts.krypton.config.Configuration
import net.shadowfacts.krypton.config.config

/**
 * @author shadowfacts
 */
var Configuration.excerptDelimiter: Regex by config(::Regex, fallback = { Regex("===") })