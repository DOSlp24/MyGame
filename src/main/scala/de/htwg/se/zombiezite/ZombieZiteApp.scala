package de.htwg.se.zombiezite

import de.htwg.se.zombiezite.controller.Controller
import de.htwg.se.zombiezite.aview.Tui

object ZombieZite {

  def main(args: Array[String]): Unit = {
    val controller = new Controller()
    val tui = new Tui(controller)
    tui.init()
    var runde = 1
    while (true) {
      tui.round(runde)
      runde += 1
    }
  }
}
