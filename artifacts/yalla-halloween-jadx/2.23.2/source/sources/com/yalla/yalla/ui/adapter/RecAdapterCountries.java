package com.yalla.yalla.ui.adapter;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.appevents.UserDataStore;
import com.yalla.yalla.model.CountryModel;
import com.yalla.yalla.ui.activity.room.CountryTagActivity;
import com.yalla.yalla.ui.activity.room.ExploreCountryRoomListActivity;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p473o0OoooOo.o0OOOO0o;

/* JADX INFO: loaded from: classes4.dex */
public final class RecAdapterCountries extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public List<CountryModel> f26980OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public OooO0O0 f26981OooO0O0 = null;

    public class OooO00o extends o0OOOO0o {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ CountryModel f26982OooO0oO;

        public OooO00o(CountryModel countryModel) {
            this.f26982OooO0oO = countryModel;
        }

        @Override // p473o0OoooOo.o0OOOO0o
        public final void OooO00o(View view) {
            OooO0O0 oooO0O0 = RecAdapterCountries.this.f26981OooO0O0;
            if (oooO0O0 != null) {
                CountryTagActivity context = (CountryTagActivity) ((p350o0OOOOoo.o0OOO0o) oooO0O0).f42855OooO0Oo;
                int i = CountryTagActivity.f26040OooOo0O;
                Intrinsics.checkNotNullParameter(context, "this$0");
                boolean z = context.f26043OooOOoo;
                CountryModel countryModel = this.f26982OooO0oO;
                if (z) {
                    o0oo0000.OooO00o.OooO0O0("101085");
                    Intent intent = new Intent();
                    Bundle bundle = new Bundle();
                    bundle.putString(UserDataStore.COUNTRY, countryModel.getName());
                    bundle.putString("countryid", countryModel.getCid());
                    intent.putExtras(bundle);
                    context.setResult(505, intent);
                    context.finish();
                    return;
                }
                if (context.f26045OooOo00) {
                    Intent intent2 = new Intent();
                    Bundle bundle2 = new Bundle();
                    bundle2.putString(UserDataStore.COUNTRY, countryModel.getName());
                    bundle2.putString("countryid", countryModel.getCid());
                    intent2.putExtras(bundle2);
                    context.setResult(523, intent2);
                    context.finish();
                    return;
                }
                String cid = countryModel.getCid();
                int i2 = 0;
                if (cid != null) {
                    try {
                        i2 = Integer.parseInt(cid);
                    } catch (Exception unused) {
                    }
                }
                Intrinsics.checkNotNullParameter(context, "context");
                Intent intent3 = new Intent(context, (Class<?>) ExploreCountryRoomListActivity.class);
                intent3.putExtra("COUNTRY_ID", i2);
                context.startActivity(intent3);
                context.finish();
            }
        }
    }

    public interface OooO0O0 {
    }

    public static class ViewHolder extends RecyclerView.o0O0O00 {
        private ImageView iv_hot;
        private TextView tv_name;

        public ViewHolder(View view) {
            super(view);
            this.iv_hot = (ImageView) view.findViewById(p562o0oOo000.o0OO00O.iv_hot);
            this.tv_name = (TextView) view.findViewById(p562o0oOo000.o0OO00O.tv_name);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        List<CountryModel> list = this.f26980OooO00o;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.o0O0O00 o0o0o00, int i) {
        ViewHolder viewHolder = (ViewHolder) o0o0o00;
        CountryModel countryModel = this.f26980OooO00o.get(i);
        viewHolder.itemView.setOnClickListener(new OooO00o(countryModel));
        viewHolder.tv_name.setText(countryModel.getName());
        if (countryModel.getHotico() == null || !"1".equals(countryModel.getHotico())) {
            viewHolder.iv_hot.setVisibility(8);
        } else {
            viewHolder.iv_hot.setVisibility(0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.o0O0O00 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(p562o0oOo000.oo0o0Oo.item_countries, viewGroup, false));
    }
}
