package com.example.menus

import android.content.Context
import android.view.View
import android.widget.PopupMenu
import android.widget.Toast

class CustomMenus {
    
    fun customMenus(context:Context,view :View){
        val pop= PopupMenu(context,view)
        pop.inflate(R.menu.menu)
    
        
        pop.setOnMenuItemClickListener {
            when(it!!.itemId){
                // id name
                R.id.group -> {
                    Toast.makeText(context, "New group", Toast.LENGTH_LONG).show()
                    true
                }
    
                R.id.new_Broadcase -> {
                    Toast.makeText(context, "new Broadcast", Toast.LENGTH_LONG).show()
                    true
                }
    
                R.id.link -> {
                    Toast.makeText(context, "link device", Toast.LENGTH_LONG).show()
                    true
                }
    
                R.id.shared -> {
                    Toast.makeText(context, " Starred messages", Toast.LENGTH_LONG).show()
                    true
                }
    
                R.id.setting -> {
                    Toast.makeText(context, " Open Setting", Toast.LENGTH_LONG).show()
                    true
                }
    
                else -> {false}
            }
        }
        //
        try {
            
            val fieldPopupMenu=PopupMenu::class.java.getDeclaredField("mPopup")
            fieldPopupMenu.isAccessible=true
            val mPopup=fieldPopupMenu.get(pop)
            mPopup.javaClass
                .getDeclaredMethod(" set " , Boolean::class.java)
                .invoke(mPopup,true)
        }catch (e:Exception){
        
        }finally {
            pop.show()
        }
        
    }
}