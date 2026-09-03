package com.yalantis.ucrop;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.yalantis.ucrop.model.CutInfo;
import java.io.File;
import java.util.List;
import p400o0Oo0O.OooOO0O;
import p400o0Oo0O.OooOOO;
import p400o0Oo0O.OooOOO0;
import p416o0Oo0oO0.o00oO0o;
import p454o0Ooo0.OooO;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0o extends RecyclerView.Adapter<OooO0O0> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public Context f20281OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public List<CutInfo> f20282OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public LayoutInflater f20283OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public OooO00o f20284OooO0Oo;

    public interface OooO00o {
    }

    public static class OooO0O0 extends RecyclerView.oo0o0Oo {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public ImageView f20285OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public ImageView f20286OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public ImageView f20287OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public TextView f20288OooO0Oo;

        public OooO0O0(View view) {
            super(view);
            this.f20285OooO00o = (ImageView) view.findViewById(OooOOO0.iv_photo);
            this.f20287OooO0OO = (ImageView) view.findViewById(OooOOO0.iv_video);
            this.f20286OooO0O0 = (ImageView) view.findViewById(OooOOO0.iv_dot);
            this.f20288OooO0Oo = (TextView) view.findViewById(OooOOO0.tv_gif);
        }
    }

    public OooO0o(Context context, List<CutInfo> list) {
        this.f20283OooO0OO = LayoutInflater.from(context);
        this.f20281OooO00o = context;
        this.f20282OooO0O0 = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        List<CutInfo> list = this.f20282OooO0O0;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.oo0o0Oo oo0o0oo, int i) {
        OooO0O0 oooO0O0 = (OooO0O0) oo0o0oo;
        CutInfo cutInfo = this.f20282OooO0O0.get(i);
        String str = cutInfo != null ? cutInfo.f20341Oooo0oO : "";
        if (cutInfo.f20347OoooOO0) {
            oooO0O0.f20286OooO0O0.setVisibility(0);
            oooO0O0.f20286OooO0O0.setImageResource(OooOO0O.ucrop_oval_true);
        } else {
            oooO0O0.f20286OooO0O0.setVisibility(4);
        }
        if (o00oO0o.OooO00o(cutInfo.f20351o000oOoO)) {
            oooO0O0.f20285OooO00o.setVisibility(8);
            oooO0O0.f20287OooO0OO.setVisibility(0);
            oooO0O0.f20287OooO0OO.setImageResource(OooOO0O.ucrop_ic_default_video);
        } else {
            oooO0O0.f20285OooO00o.setVisibility(0);
            oooO0O0.f20287OooO0OO.setVisibility(8);
            Uri uriFromFile = ((Build.VERSION.SDK_INT >= 29) || o00oO0o.OooO0Oo(str)) ? Uri.parse(str) : Uri.fromFile(new File(str));
            oooO0O0.f20288OooO0Oo.setVisibility(o00oO0o.OooO0OO(cutInfo.f20351o000oOoO) ? 0 : 8);
            OooO.OooO0O0(this.f20281OooO00o, uriFromFile, cutInfo.f20350OoooOo0, 200, 220, new com.yalantis.ucrop.OooO0O0(oooO0O0));
            oooO0O0.itemView.setOnClickListener(new OooO0OO(this, oooO0O0));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.oo0o0Oo onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new OooO0O0(this.f20283OooO0OO.inflate(OooOOO.ucrop_picture_gf_adapter_edit_list, viewGroup, false));
    }
}
