/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.modelix.model.api

import kotlin.reflect.KClass

actual fun logError(message: String, exception: Exception, contextClass: KClass<*>) {
    console.error(message, exception)
}

actual fun logWarning(message: String, exception: Exception, contextClass: KClass<*>) {
    console.warn(message, exception)
}

actual fun logDebug(message: () -> String?, contextClass: KClass<*>) {
    val msg = message()
    if (!msg.isNullOrEmpty()) console.log(msg)
}

actual fun logTrace(message: () -> String?, contextClass: KClass<*>) {
//    console.log(message())
}

actual inline fun <R> runSynchronized(lock: Any, block: () -> R): R {
    return block()
}
