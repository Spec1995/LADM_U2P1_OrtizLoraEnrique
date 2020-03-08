package mx.edu.ladm_p2u1_ortizloraenrique

import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.view.MotionEvent
import android.view.View

class Lienzo(p:MainActivity) : View(p) {
    // se requiere p para que view sepa cual activity va a trabajar
    var puntero = p
    /*var cx = 150f
    var cy = 150f
    var tx = 733f
    var ty = 818f*/
    /*var circulo = FiguraGeometrica(150, 150, 120)
    var cuadrado = FiguraGeometrica(733, 818, 200, 200)
    var rectangulo = FiguraGeometrica(400, 1200, 400, 200)
    var circulo2 = FiguraGeometrica(500, 1400, 50)
    var punteroFiguraGeometrica: FiguraGeometrica? = null*/

    var casaRect = FiguraGeometrica(130, 500, 200, 150)
    var pisoLinea = FiguraGeometrica(0, 650, 550, 1)
    var ventanaCirculo = FiguraGeometrica(160, 550, 25)
    var puertaRect = FiguraGeometrica(200, 575, 50, 75)

    var rectArbol = FiguraGeometrica(20, 515, 15, 60)
    var circuloArbol1 = FiguraGeometrica(27, 485, 15)
    var circuloArbol2 = FiguraGeometrica(27, 505, 15)
    var techoCasa = FiguraGeometrica(130, 450, 200, 50)

    var nieve1 = FiguraGeometrica(50, 10, 10)
    var nieve2 = FiguraGeometrica(100, 20, 10)
    var nieve3 = FiguraGeometrica(150, 30, 10)
    var nieve4 = FiguraGeometrica(200, 40, 10)
    var nieve5 = FiguraGeometrica(250, 50, 10)
    var nieve6 = FiguraGeometrica(300, 10, 10)
    var nieve7 = FiguraGeometrica(350, 20, 10)
    var nieve8 = FiguraGeometrica(400, 30, 10)
    var nieve9 = FiguraGeometrica(450, 40, 10)
    var nieve10 = FiguraGeometrica(500, 50, 10)

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        var paint = Paint()

        canvas.drawColor(Color.WHITE)

        //DIBUJAR TARJETA NAVIDEÑA

        //CASA
        paint.style = Paint.Style.FILL
        paint.color = Color.WHITE
        paint.style = Paint.Style.STROKE
        paint.color = Color.BLACK
        casaRect.pintar(canvas, paint)

        //PUERTA
        paint.color = Color.WHITE
        paint.style = Paint.Style.STROKE
        paint.color = Color.BLACK
        puertaRect.pintar(canvas, paint)

        //TECHO

        paint.color = Color.WHITE
        paint.style = Paint.Style.STROKE
        paint.color = Color.BLACK
        paint.strokeWidth = 5f
        techoCasa.pintar(canvas, paint)

        //PISO
        paint.style = Paint.Style.STROKE
        paint.strokeWidth = 2f
        paint.color = Color.BLACK
        pisoLinea.pintar(canvas, paint)

        //Hojas Circ Arbol
        paint.style = Paint.Style.STROKE
        paint.color = Color.BLACK
        paint.strokeWidth = 2f
        circuloArbol1.pintar(canvas, paint)


        paint.style = Paint.Style.STROKE
        paint.color = Color.BLACK
        paint.strokeWidth = 2f
        circuloArbol2.pintar(canvas, paint)

        //RECTANGULO ARBOL
        paint.color = Color.WHITE
        paint.style = Paint.Style.STROKE
        paint.color = Color.BLACK
        rectArbol.pintar(canvas, paint)

        //VENTANA
        paint.color = Color.WHITE
        paint.style = Paint.Style.STROKE
        paint.color = Color.BLACK
        ventanaCirculo.pintar(canvas, paint)


        //BOLAS DE NIEVE

        paint.style = Paint.Style.STROKE
        paint.color = Color.BLACK
        paint.strokeWidth = 2f
        nieve1.pintar(canvas, paint)

        paint.style = Paint.Style.STROKE
        paint.color = Color.BLACK
        paint.strokeWidth = 2f
        nieve2.pintar(canvas, paint)

        paint.style = Paint.Style.STROKE
        paint.color = Color.BLACK
        paint.strokeWidth = 2f
        nieve3.pintar(canvas, paint)

        paint.style = Paint.Style.STROKE
        paint.color = Color.BLACK
        paint.strokeWidth = 2f
        nieve4.pintar(canvas, paint)



        paint.style = Paint.Style.STROKE
        paint.color = Color.BLACK
        paint.strokeWidth = 2f
        nieve5.pintar(canvas, paint)


        paint.style = Paint.Style.STROKE
        paint.color = Color.BLACK
        paint.strokeWidth = 2f
        nieve6.pintar(canvas, paint)

        paint.style = Paint.Style.STROKE
        paint.color = Color.BLACK
        paint.strokeWidth = 2f
        nieve7.pintar(canvas, paint)


        paint.style = Paint.Style.STROKE
        paint.color = Color.BLACK
        paint.strokeWidth = 2f
        nieve8.pintar(canvas, paint)

        paint.style = Paint.Style.STROKE
        paint.color = Color.BLACK
        paint.strokeWidth = 2f
        nieve9.pintar(canvas, paint)

        paint.style = Paint.Style.STROKE
        paint.color = Color.BLACK
        paint.strokeWidth = 2f
        nieve10.pintar(canvas, paint)

    }

    /*
    override fun onTouchEvent(event: MotionEvent): Boolean {
        puntero.setTitle("")
        when (event.action) {
            MotionEvent.ACTION_DOWN -> {
                //REVISAMOS QUIEN ESTA EN AREA
                if (circulo.estaEnArea(event)) {
                    punteroFiguraGeometrica = circulo
                    puntero.setTitle("TOCASTE CIRCULO")
                }
                if (cuadrado.estaEnArea(event)) {
                    punteroFiguraGeometrica = cuadrado
                    puntero.setTitle("TOCASTE CUADRADO")
                }
                if (rectangulo.estaEnArea(event)) {
                    punteroFiguraGeometrica = rectangulo
                    puntero.setTitle("TOCASTE RECTANGULO")
                }
                if (circulo2.estaEnArea(event)) {
                    punteroFiguraGeometrica = circulo2
                    puntero.setTitle("TOCASTE CIRCULO2")
                }
            }
            MotionEvent.ACTION_MOVE -> {
                if (punteroFiguraGeometrica != null) {
                    punteroFiguraGeometrica!!.arrastrar(event)
                }

            }
            MotionEvent.ACTION_UP -> {
                punteroFiguraGeometrica = null
            }
        }
        invalidate()
        return true
    }*/

    /*
    fun animarCirculo() {
        circulo2.rebote(width, height)

        invalidate()
    }*/
    fun simulCaidaNieve() {
        nieve1.caerNieve(650f)
        nieve2.caerNieve(650f)
        nieve3.caerNieve(650f)
        nieve4.caerNieve(650f)
        nieve5.caerNieve(650f)
        nieve6.caerNieve(650f)
        nieve7.caerNieve(650f)
        nieve8.caerNieve(650f)
        nieve9.caerNieve(650f)
        nieve10.caerNieve(650f)
        invalidate()
    }
}