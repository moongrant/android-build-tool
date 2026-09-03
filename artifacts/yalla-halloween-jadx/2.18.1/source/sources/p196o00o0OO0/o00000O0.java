package p196o00o0OO0;

import android.app.Activity;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.app.selectPicture.model.FileModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import o000O000.OooO00o;
import o0O0O00.o0ooOOo;
import p193o00o0O00.OooOo;
import p201o00o0OoO.o000OO00;
import p400o0Oo0O.OooO;
import p400o0Oo0O.OooOOO;
import p400o0Oo0O.OooOOO0;

/* JADX INFO: loaded from: classes.dex */
public final class o00000O0 extends BaseAdapter {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public Activity f33200Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public List<FileModel> f33201Oooo0oO = null;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public o000OO00 f33202Oooo0oo;

    public o00000O0(Activity activity, o000OO00 o000oo01) {
        this.f33202Oooo0oo = o000oo01;
        this.f33200Oooo0o = activity;
        OooO0O0(null);
    }

    public final void OooO0O0(List<FileModel> list) {
        this.f33201Oooo0oO = list;
        if (list == null) {
            this.f33201Oooo0oO = new ArrayList();
        }
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f33201Oooo0oO.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        List<FileModel> list = this.f33201Oooo0oO;
        if (list == null || i >= list.size()) {
            return null;
        }
        return this.f33201Oooo0oO.get(i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        o00000O o00000o;
        FileModel fileModel;
        if (view == null) {
            o00000O o00000o2 = new o00000O();
            View viewInflate = LayoutInflater.from(this.f33200Oooo0o).inflate(OooOOO.layout_image_file, (ViewGroup) null);
            o00000o2.f33199OooO0O0 = (ImageView) viewInflate.findViewById(OooOOO0.layout_image_file_iv);
            TextView tv = (TextView) viewInflate.findViewById(OooOOO0.layout_image_file_name_tv);
            o00000o2.f33198OooO00o = tv;
            o000OO00 o000oo01 = this.f33202Oooo0oo;
            Objects.requireNonNull(o000oo01);
            Intrinsics.checkNotNullParameter(tv, "tv");
            float f = o000oo01.f33229OoooOo0.f33153OooOO0O;
            if (!(f == -1.0f)) {
                tv.setTextSize(f);
            }
            int i2 = o000oo01.f33229OoooOo0.f33152OooOO0;
            if (i2 != -1) {
                tv.setTextColor(i2);
            }
            viewInflate.setTag(o00000o2);
            o00000o = o00000o2;
            view = viewInflate;
        } else {
            o00000o = (o00000O) view.getTag();
        }
        List<FileModel> list = this.f33201Oooo0oO;
        if (list != null && i < list.size() && (fileModel = this.f33201Oooo0oO.get(i)) != null && fileModel.f12309Oooo0oo != null && fileModel.f12310OoooO00 != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(fileModel.f12309Oooo0oo);
            sb.append(" (");
            String strOooO00o = o0ooOOo.OooO00o(sb, fileModel.f12306Oooo, ")");
            int iOooO0O0 = OooO00o.OooO0O0(this.f33200Oooo0o, OooO.select_picture_color_85000000);
            int i3 = this.f33202Oooo0oo.f33229OoooOo0.f33152OooOO0;
            if (i3 != -1) {
                iOooO0O0 = i3;
            }
            TextView textView = o00000o.f33198OooO00o;
            int length = fileModel.f12309Oooo0oo.length();
            int length2 = strOooO00o.length();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strOooO00o);
            spannableStringBuilder.setSpan(new ForegroundColorSpan(iOooO0O0), length, length2, 33);
            textView.setText(spannableStringBuilder);
            OooOo.OooO00o().OooO0O0(this.f33200Oooo0o, fileModel.f12310OoooO00, o00000o.f33199OooO0O0);
        }
        return view;
    }
}
