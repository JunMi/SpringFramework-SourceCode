/**
 * <strong>Deprecated</strong> as of Spring Framework 5.2 in favor of complete
 * solutions from third parties such as
 * <a href="https://github.com/h-thurow/Simple-JNDI">Simple-JNDI</a>.
 *
 * <p>The simplest implementation of the JNDI SPI that could possibly work.
 *
 * <p>Useful for setting up a simple JNDI environment for test suites
 * or stand-alone applications. If, for example, JDBC DataSources get bound to the
 * same JNDI names as within a Java EE container, both application code and
 * configuration can be reused without changes.
 */
@NonNullApi
@NonNullFields
package org.springframework.mock.jndi;

import org.springframework.lang.NonNullApi;
import org.springframework.lang.NonNullFields;
