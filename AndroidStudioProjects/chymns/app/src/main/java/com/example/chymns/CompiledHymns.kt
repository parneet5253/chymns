package com.example.chymns

import android.os.Bundle
import android.os.PersistableBundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class CompiledHymns: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.compiledhymns)


        val recyclerview = findViewById<RecyclerView?>(R.id.recycerView2)




        recyclerview?.layoutManager = LinearLayoutManager(this)


        val data = ArrayList<ItemsViewModel1>()

        data.add(
            ItemsViewModel1(
                "this is compiled Hymns",
                "lorem lpsum,sometimes reffered to as the placeholder text used in design "
            )
        )
        data.add(
            ItemsViewModel1(
                "Sunder Gutka ",
                "lorem lpsum,sometimes reffered to as the placeholder text used in design "
            )
        )
        data.add(
            ItemsViewModel1(
                "Kabit Bhai Gurdas Ji ",
                "lorem lpsum,sometimes reffered to as the placeholder text used in design "
            )
        )



        val adap1= CustomAdapter1(this,data)
        recyclerview?.adapter=adap1
    }

    // val adap = CustomAdapter(data, this)
   // recyclerview?.adapter = adap

}

    //(private val mList: List<itemViewModel1>) : Fragment(), CustomAdapter1.OnNoteListener,
  //  CustomAdapter.OnNoteListener {
   // override fun onCreateView(
    //    inflater: LayoutInflater,
     //   container: ViewGroup?,
     //   savedInstanceState: Bundle?
   // ): View? {


      //  val view = inflater.inflate(R.layout.compiledhymns, container, false)
      //  val recyclerView = view.findViewById<RecyclerView?>(R.id.recyclerView2)
      //  val iteDecorator1 =
       //     SimpleDividerItemDecoration(container!!.context, R.drawable.line_divider)
     //   recyclerView?.addItemDecoration((iteDecorator1))
     //   recyclerView?.layoutManager = LinearLayoutManager(context)

      //  val data1 = ArrayList<itemViewModel1>()
       // data1.add(
        //    itemViewModel1(
           //     "simple data in the compiled view of the gurbani searcher app",
          //      "other also have the simple data"
          //  )
        //)

        //val data = ArrayList<itemViewModel1>()

      //  data.add(
       //     itemViewModel1(
       //         "simple data in the compiled view of the gurbani searcher app",
       //         "other also have the simple data"
       //     )
       // )

      //  val adap = CustomAdapter(data1, this)
      //  recyclerView?.adapter = adap

  //  }
  //  override fun onNoteClick(position: Int) {


       // mList.get(position)
       // Toast.makeText(context, "you Clicked $position ", Toast.LENGTH_SHORT).show()
   // }

//}

