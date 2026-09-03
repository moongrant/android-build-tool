package p133o00OO00o;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.app.base.model.CountryModel;
import com.weieyu.yalla.R;
import com.yalla.yalla.ui.activity.room.CountryTagActivity;
import com.yalla.yalla.ui.activity.room.ExploreCountryRoomListActivity;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p142o00OOooO.OooOOO;
import p254o00ooO0O.o000Oo0;
import p654o0ooo.o00Oo0;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOO0 extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public List<CountryModel> f31217OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public OooO0O0 f31218OooO0O0 = null;

    public class OooO00o extends o00Oo0 {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ CountryModel f31219Oooo;

        public OooO00o(CountryModel countryModel) {
            this.f31219Oooo = countryModel;
        }

        @Override // p654o0ooo.o00Oo0
        public final void OooO00o(View view) {
            OooO0O0 oooO0O0 = OooOOO0.this.f31218OooO0O0;
            if (oooO0O0 != null) {
                CountryModel countryModel = this.f31219Oooo;
                CountryTagActivity context = (CountryTagActivity) ((OooOOO) oooO0O0).f31896OooO0o0;
                int i = CountryTagActivity.f22764OooooO0;
                Intrinsics.checkNotNullParameter(context, "this$0");
                if (context.f22767OoooOoo) {
                    Intent intent = new Intent();
                    Bundle bundle = new Bundle();
                    bundle.putString("country", countryModel.getName());
                    bundle.putString("countryid", countryModel.getCid());
                    intent.putExtras(bundle);
                    context.setResult(505, intent);
                    context.finish();
                    return;
                }
                if (!context.f22768Ooooo00) {
                    int iOooO0OO = o000Oo0.OooO0OO(countryModel.getCid(), 0);
                    Intrinsics.checkNotNullParameter(context, "context");
                    Intent intent2 = new Intent(context, (Class<?>) ExploreCountryRoomListActivity.class);
                    intent2.putExtra("COUNTRY_ID", iOooO0OO);
                    context.startActivity(intent2);
                    context.finish();
                    return;
                }
                Intent intent3 = new Intent();
                Bundle bundle2 = new Bundle();
                bundle2.putString("country", countryModel.getName());
                bundle2.putString("countryid", countryModel.getCid());
                intent3.putExtras(bundle2);
                context.setResult(523, intent3);
                context.finish();
            }
        }
    }

    public interface OooO0O0 {
    }

    public static class OooO0OO extends RecyclerView.oo0o0Oo {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public ImageView f31221OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public TextView f31222OooO0O0;

        public OooO0OO(View view) {
            super(view);
            this.f31221OooO00o = (ImageView) view.findViewById(R.id.iv_hot);
            this.f31222OooO0O0 = (TextView) view.findViewById(R.id.tv_name);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        List<CountryModel> list = this.f31217OooO00o;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.oo0o0Oo oo0o0oo, int i) {
        OooO0OO oooO0OO = (OooO0OO) oo0o0oo;
        CountryModel countryModel = this.f31217OooO00o.get(i);
        oooO0OO.itemView.setOnClickListener(new OooO00o(countryModel));
        oooO0OO.f31222OooO0O0.setText(countryModel.getName());
        if (countryModel.getHotico() == null || !"1".equals(countryModel.getHotico())) {
            oooO0OO.f31221OooO00o.setVisibility(8);
        } else {
            oooO0OO.f31221OooO00o.setVisibility(0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.oo0o0Oo onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new OooO0OO(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_countries, viewGroup, false));
    }
}
