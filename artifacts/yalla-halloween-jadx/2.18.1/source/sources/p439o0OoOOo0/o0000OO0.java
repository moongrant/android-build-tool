package p439o0OoOOo0;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import com.squareup.picasso.MemoryPolicy;
import com.squareup.picasso.Oooo0;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.o000oOoO;
import com.squareup.picasso.o00oO0o;
import com.twitter.sdk.android.core.models.MediaEntity;
import com.twitter.sdk.android.tweetui.internal.GalleryImageView;
import com.twitter.sdk.android.tweetui.internal.OooO00o;
import java.util.ArrayList;
import java.util.List;
import p105o000oo0o.o00Ooo;

/* JADX INFO: loaded from: classes2.dex */
public final class o0000OO0 extends o00Ooo {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final List<MediaEntity> f40135OooO0OO = new ArrayList();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Context f40136OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final OooO00o.InterfaceC0183OooO00o f40137OooO0o0;

    public o0000OO0(Context context, OooO00o.InterfaceC0183OooO00o interfaceC0183OooO00o) {
        this.f40136OooO0Oo = context;
        this.f40137OooO0o0 = interfaceC0183OooO00o;
    }

    @Override // p105o000oo0o.o00Ooo
    public final void OooO00o(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.twitter.sdk.android.core.models.MediaEntity>] */
    @Override // p105o000oo0o.o00Ooo
    public final int OooO0OO() {
        return this.f40135OooO0OO.size();
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [java.util.ArrayList, java.util.List<com.twitter.sdk.android.core.models.MediaEntity>] */
    @Override // p105o000oo0o.o00Ooo
    public final Object OooO0oO(ViewGroup viewGroup, int i) {
        Bitmap bitmapOooO0o0;
        GalleryImageView galleryImageView = new GalleryImageView(this.f40136OooO0Oo);
        galleryImageView.setSwipeToDismissCallback(this.f40137OooO0o0);
        viewGroup.addView(galleryImageView);
        o000oOoO o000ooooOooO0Oo = Picasso.OooO0o(this.f40136OooO0Oo).OooO0Oo(((MediaEntity) this.f40135OooO0OO.get(i)).f19988OoooO);
        long jNanoTime = System.nanoTime();
        o00oO0o.OooO0O0();
        if (o000ooooOooO0Oo.f19817OooO0OO) {
            throw new IllegalStateException("Fit cannot be used with a Target.");
        }
        Oooo0.OooO00o oooO00o = o000ooooOooO0Oo.f19816OooO0O0;
        if ((oooO00o.f19782OooO00o == null && oooO00o.f19783OooO0O0 == 0) ? false : true) {
            Oooo0 oooo0OooO00o = o000ooooOooO0Oo.OooO00o(jNanoTime);
            String strOooO0o0 = o00oO0o.OooO0o0(oooo0OooO00o);
            if (!MemoryPolicy.OooO00o(0) || (bitmapOooO0o0 = o000ooooOooO0Oo.f19815OooO00o.OooO0o0(strOooO0o0)) == null) {
                galleryImageView.OooO0OO();
                o000ooooOooO0Oo.f19815OooO00o.OooO0OO(new com.squareup.picasso.o00Ooo(o000ooooOooO0Oo.f19815OooO00o, galleryImageView, oooo0OooO00o, strOooO0o0, o000ooooOooO0Oo.f19818OooO0Oo));
            } else {
                o000ooooOooO0Oo.f19815OooO00o.OooO00o(galleryImageView);
                galleryImageView.OooO0O0(bitmapOooO0o0);
            }
        } else {
            o000ooooOooO0Oo.f19815OooO00o.OooO00o(galleryImageView);
            galleryImageView.OooO0OO();
        }
        return galleryImageView;
    }

    @Override // p105o000oo0o.o00Ooo
    public final boolean OooO0oo(View view, Object obj) {
        return view == obj;
    }
}
