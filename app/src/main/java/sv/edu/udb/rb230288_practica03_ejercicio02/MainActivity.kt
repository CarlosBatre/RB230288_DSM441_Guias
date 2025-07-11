package sv.edu.udb.rb230288_practica03_ejercicio02

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    // Declaración de los TextViews para mostrar la información en pantalla
    private lateinit var txtAbierto: TextView
    private lateinit var txtSuspendido: TextView
    private lateinit var txtCerrado: TextView
    private lateinit var txtEstado: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
// Asocia el layout XML con esta actividad
        setContentView(R.layout.activity_main)
// Inicializa los TextViews con sus IDs del layout
        txtAbierto = findViewById(R.id.txtAbierto)
        txtSuspendido = findViewById(R.id.txtSuspendido)
        txtCerrado = findViewById(R.id.txtCerrado)
        txtEstado = findViewById(R.id.txtEstado)
// Registra el observador del ciclo de vida para esta actividad
// El observador recibirá las llamadas de los eventos del ciclo de vida
        lifecycle.addObserver(
            LifeCycleObserver(
                this,
                txtAbierto,
                txtSuspendido,
                txtCerrado,
                txtEstado
            )
        )
    }
}