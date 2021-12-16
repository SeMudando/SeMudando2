/*
 * @copyright@
 */
@file:Suppress("unused") // main is called by webpack

import zakadabar.core.browser.application.ZkApplication
import zakadabar.core.browser.application.application
import zakadabar.core.browser.util.io
import zakadabar.core.resource.initTheme
import zakadabar.template.frontend.browser.Routing
import zakadabar.template.frontend.browser.resources.AppDarkTheme
import zakadabar.template.frontend.browser.resources.AppLightTheme
import zakadabar.template.resources.strings

fun main() {

    application = ZkApplication()

    zakadabar.lib.accounts.browser.install(application)
    zakadabar.lib.i18n.browser.install(application)

    io {

        with(application) {

            initSession()

            initTheme(AppLightTheme(), AppDarkTheme())

            initLocale(strings)

            initRouting(Routing())

            run()

        }

    }

}