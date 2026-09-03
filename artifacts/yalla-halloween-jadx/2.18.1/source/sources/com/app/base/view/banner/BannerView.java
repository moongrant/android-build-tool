package com.app.base.view.banner;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.o000OOo;
import com.youth.banner.config.BannerConfig;
import p282o0O00o0.OooO;
import p282o0O00o0.OooOO0;
import p282o0O00o0.OooOO0O;

/* JADX INFO: loaded from: classes.dex */
public class BannerView extends RecyclerView {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public float f12152Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public OooOO0O f12153Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public OooOO0 f12154Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public int f12155Oooo0oo;

    public BannerView(@NonNull Context context) {
        this(context, null);
    }

    public final void OooO00o() {
        RecyclerView.Adapter adapter = getAdapter();
        if (adapter == null || adapter.getItemCount() == 0) {
            return;
        }
        int size = ((OooO) getAdapter()).f35204OooO0OO.size();
        int itemCount = adapter.getItemCount() / 2;
        scrollToPosition(itemCount - (itemCount % size));
    }

    public final int OooO0OO() {
        int iFindFirstVisibleItemPosition = this.f12154Oooo0oO.findFirstVisibleItemPosition();
        if (iFindFirstVisibleItemPosition == -1) {
            return iFindFirstVisibleItemPosition;
        }
        int i = iFindFirstVisibleItemPosition + 1;
        smoothScrollToPosition(i);
        return i;
    }

    public int getDuration() {
        return this.f12155Oooo0oo;
    }

    public float getSpeed() {
        return this.f12152Oooo;
    }

    public void setDuration(int i) {
        this.f12155Oooo0oo = i;
    }

    public void setSpeed(float f) {
        this.f12152Oooo = f;
    }

    public BannerView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BannerView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f12155Oooo0oo = BannerConfig.LOOP_TIME;
        this.f12152Oooo = 800.0f;
        OooOO0 oooOO1 = new OooOO0(this, context);
        this.f12154Oooo0oO = oooOO1;
        setLayoutManager(oooOO1);
        new o000OOo().attachToRecyclerView(this);
        this.f12153Oooo0o = new OooOO0O(this);
    }
}
