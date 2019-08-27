package buu.informatics.s59161126.car

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var SlotCar = listOf<Car>(Car() , Car() , Car())
    var selectSlot = ""


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val slot1_button: Button = findViewById(R.id.slot1)
        val slot2_button: Button = findViewById(R.id.slot2)
        val slot3_button: Button = findViewById(R.id.slot3)

        slot1_button.setBackgroundColor(Color.RED)
        slot1_button.setOnClickListener { cSlot1()}


        slot2_button.setBackgroundColor(Color.RED)
        slot2_button.setOnClickListener { cSlot2() }


        slot3_button.setBackgroundColor(Color.RED)
        slot3_button.setOnClickListener { cSlot3() }

    }

    /*********************** SLOT 1 ********************************/


    fun cSlot1(){
        val slot1_button: Button = findViewById(R.id.slot1)

        val up = findViewById<Button>(R.id.up)
        val de = findViewById<Button>(R.id.de)
        up.setOnClickListener{ cs1()}
        de.setOnClickListener{ de1()}

        findViewById<TextView>(R.id.name_rental).text = SlotCar[0].name
        findViewById<TextView>(R.id.serial_car).text = SlotCar[0].car
        findViewById<TextView>(R.id.brand_car).text = SlotCar[0].brand
    }

    fun cs1(){
        val slot1_button: Button = findViewById(R.id.slot1)

        if(SlotCar[0].name == "") {
            SlotCar[0].name = findViewById<TextView>(R.id.name_rental).text.toString()
            SlotCar[0].car = findViewById<TextView>(R.id.serial_car).text.toString()
            SlotCar[0].brand = findViewById<TextView>(R.id.brand_car).text.toString()

            findViewById<Button>(R.id.slot1).text = "Full"
            slot1_button.setBackgroundColor(Color.GREEN)

            findViewById<TextView>(R.id.name_rental).text = ""
            findViewById<TextView>(R.id.serial_car).text = ""
            findViewById<TextView>(R.id.brand_car).text = ""
        }


        else {
            findViewById<TextView>(R.id.name_rental).requestFocus()
            findViewById<TextView>(R.id.name_rental).text = SlotCar.get(0).name
            findViewById<TextView>(R.id.serial_car).text = SlotCar.get(0).car
            findViewById<TextView>(R.id.brand_car).text = SlotCar.get(0).brand
        }
    }

    fun de1(){
        val slot1_button: Button = findViewById(R.id.slot1)
        SlotCar[0].name = ""
        SlotCar[0].car = ""
        SlotCar[0].brand = ""
        findViewById<TextView>(R.id.name_rental).text = ""
        findViewById<TextView>(R.id.serial_car).text = ""
        findViewById<TextView>(R.id.brand_car).text = ""
        findViewById<Button>(R.id.slot1).text = "Empty"
        slot1_button.setBackgroundColor(Color.RED)
    }







    /*********************** SLOT 2 ********************************/


    fun cSlot2(){
        val slot2_button: Button = findViewById(R.id.slot2)

        val up = findViewById<Button>(R.id.up)
        val de = findViewById<Button>(R.id.de)
        up.setOnClickListener{ cs2()}
        de.setOnClickListener{ de2()}

        findViewById<TextView>(R.id.name_rental).text = SlotCar[1].name
        findViewById<TextView>(R.id.serial_car).text = SlotCar[1].car
        findViewById<TextView>(R.id.brand_car).text = SlotCar[1].brand
    }

    fun cs2(){
        val slot2_button: Button = findViewById(R.id.slot2)
        if(SlotCar[1].name == "") {
            SlotCar[1].name = findViewById<TextView>(R.id.name_rental).text.toString()
            SlotCar[1].car = findViewById<TextView>(R.id.serial_car).text.toString()
            SlotCar[1].brand = findViewById<TextView>(R.id.brand_car).text.toString()
            findViewById<Button>(R.id.slot2).text = "Full"

            findViewById<TextView>(R.id.name_rental).text = ""
            findViewById<TextView>(R.id.serial_car).text = ""
            findViewById<TextView>(R.id.brand_car).text = ""
            slot2_button.setBackgroundColor(Color.GREEN)
        } else {
            findViewById<TextView>(R.id.name_rental).requestFocus()
            findViewById<TextView>(R.id.name_rental).text = SlotCar.get(1).name
            findViewById<TextView>(R.id.serial_car).text = SlotCar.get(1).car
            findViewById<TextView>(R.id.brand_car).text = SlotCar.get(1).brand
        }
    }

    fun de2(){
        val slot2_button: Button = findViewById(R.id.slot2)
        SlotCar[1].name = ""
        SlotCar[1].car = ""
        SlotCar[1].brand = ""
        findViewById<TextView>(R.id.name_rental).text = ""
        findViewById<TextView>(R.id.serial_car).text = ""
        findViewById<TextView>(R.id.brand_car).text = ""
        findViewById<Button>(R.id.slot2).text = "Empty"
        slot2_button.setBackgroundColor(Color.RED)
    }








    /*********************** SLOT 3 ********************************/


    fun cSlot3(){
        val slot3_button: Button = findViewById(R.id.slot3)

        val up = findViewById<Button>(R.id.up)
        val de = findViewById<Button>(R.id.de)
        up.setOnClickListener{ cs3()}
        de.setOnClickListener{ de3()}

        findViewById<TextView>(R.id.name_rental).text = SlotCar[2].name
        findViewById<TextView>(R.id.serial_car).text = SlotCar[2].car
        findViewById<TextView>(R.id.brand_car).text = SlotCar[2].brand
    }

    fun cs3(){

        val slot3_button: Button = findViewById(R.id.slot3)
        if(SlotCar[2].name == "") {
            SlotCar[2].name = findViewById<TextView>(R.id.name_rental).text.toString()
            SlotCar[2].car = findViewById<TextView>(R.id.serial_car).text.toString()
            SlotCar[2].brand = findViewById<TextView>(R.id.brand_car).text.toString()
            findViewById<Button>(R.id.slot3).text = "Full"

            findViewById<TextView>(R.id.name_rental).text = ""
            findViewById<TextView>(R.id.serial_car).text = ""
            findViewById<TextView>(R.id.brand_car).text = ""
            slot3_button.setBackgroundColor(Color.GREEN)
        } else {
            findViewById<TextView>(R.id.name_rental).requestFocus()
            findViewById<TextView>(R.id.name_rental).text = SlotCar.get(2).name
            findViewById<TextView>(R.id.serial_car).text = SlotCar.get(2).car
            findViewById<TextView>(R.id.brand_car).text = SlotCar.get(2).brand
        }
    }

    fun de3(){
        val slot3_button: Button = findViewById(R.id.slot3)
        SlotCar[2].name = ""
        SlotCar[2].car = ""
        SlotCar[2].brand = ""
        findViewById<TextView>(R.id.name_rental).text = ""
        findViewById<TextView>(R.id.serial_car).text = ""
        findViewById<TextView>(R.id.brand_car).text = ""
        findViewById<Button>(R.id.slot3).text = "Empty"
        slot3_button.setBackgroundColor(Color.RED)
    }

}
