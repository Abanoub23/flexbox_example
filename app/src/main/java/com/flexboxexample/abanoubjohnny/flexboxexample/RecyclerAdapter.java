package com.flexboxexample.abanoubjohnny.flexboxexample;

import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

public class RecyclerAdapter extends BaseQuickAdapter<String,BaseViewHolder> {
    public RecyclerAdapter(@Nullable List<String> data) {
        super(R.layout.layout_tag_item, data);

    }

    @Override
    protected void convert(BaseViewHolder helper, String item) {
        helper.setText(R.id.tvTag,item);
        helper.addOnClickListener(R.id.ivDelete);
    }
}
