/*
 * EchoCallback.java
 * MrBin99 © 2018
 */
package net.mrbin99.laravelechoandroid

import io.socket.client.Ack
import io.socket.emitter.Emitter

/**
 * Echo callback.
 */
interface EchoCallback : Emitter.Listener, Ack