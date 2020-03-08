package mx.edu.ladm_p2u1_ortizloraenrique

class HiloAnimacion (p:MainActivity):Thread(){
    var puntero = p

    override fun run() {
        super.run()

        while(true){
            sleep(10)
            puntero.runOnUiThread {
                puntero.lienzo!!.simulCaidaNieve()
            }
        }
    }
}