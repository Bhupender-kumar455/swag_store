package com.example.swag_store.Adapters

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.swag_store.R
import com.example.swag_store.model.Category

class CategoryAdapter(context: Context,  categories:List<Category>) :BaseAdapter(){
        val context = context
    val categories = categories

    @SuppressLint("ViewHolder")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
      val categoryView : View
      val holder:viewHolder
      if(convertView==null){
          categoryView = LayoutInflater.from(context).inflate(R.layout.category_list_view,null)
          holder= viewHolder()

          holder.categoryImage=categoryView.findViewById(R.id.categoryImage)
          holder.categoryName=categoryView.findViewById(R.id.categoryText)
          categoryView.tag=holder
      }
        else{
            holder=convertView.tag as viewHolder
          categoryView=convertView
          println("Go green recycle")
      }
        val category = categories[position]
        val resourceId = context.resources.getIdentifier(category.image,"drawable",context.packageName)
        holder.categoryImage?.setImageResource(resourceId)
        println(resourceId)

        holder.categoryName?.text = category.title
        return categoryView

    }
    override fun getItem(position: Int): Any {
    return categories[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }
    override fun getCount(): Int {
    return categories.count()
    }
    private class viewHolder{
        var categoryImage:ImageView?=null
        var categoryName:TextView?=null
    }
}