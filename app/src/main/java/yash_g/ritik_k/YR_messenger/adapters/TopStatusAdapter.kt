package yash_g.ritik_k.YR_messenger.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import yash_g.ritik_k.YR_messenger.databinding.ItemStatusBinding
import androidx.recyclerview.widget.RecyclerView
import yash_g.ritik_k.YR_messenger.R
import yash_g.ritik_k.YR_messenger.model.Status
import yash_g.ritik_k.YR_messenger.model.UserStatus

class TopStatusAdapter(mContext:Context,statusList:ArrayList<UserStatus>): RecyclerView.Adapter<TopStatusAdapter.TopStatusViewHolder>() {
    private val mContext:Context
    private val statusList:ArrayList<UserStatus>
    init {
        this.mContext =mContext
        this.statusList=statusList
    }

    class TopStatusViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
        val binding =ItemStatusBinding.bind(itemView)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TopStatusViewHolder {
        val view =LayoutInflater.from(mContext).inflate(R.layout.item_status,parent,false)
        return TopStatusViewHolder(view)
    }

    override fun onBindViewHolder(holder: TopStatusViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return statusList.size
    }
}