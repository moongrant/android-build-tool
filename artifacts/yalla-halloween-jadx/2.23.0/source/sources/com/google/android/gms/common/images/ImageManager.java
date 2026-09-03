package com.google.android.gms.common.images;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.ResultReceiver;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.Constants;
import com.google.android.gms.internal.base.zak;
import com.google.android.gms.internal.base.zap;
import com.google.android.gms.internal.base.zaq;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes3.dex */
public final class ImageManager {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static ImageManager f14976OooO;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final Object f14977OooO0oO = new Object();

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final HashSet<Uri> f14978OooO0oo = new HashSet<>();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f14979OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final zaq f14980OooO0O0 = new zaq(Looper.getMainLooper());

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final ExecutorService f14981OooO0OO = zap.zaa().zab(4, 2);

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final HashMap f14982OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final HashMap f14983OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final HashMap f14984OooO0o0;

    @KeepName
    public final class ImageReceiver extends ResultReceiver {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final Uri f14985OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final ArrayList<zag> f14987OooO0o0;

        public ImageReceiver(Uri uri) {
            super(new zaq(Looper.getMainLooper()));
            this.f14985OooO0Oo = uri;
            this.f14987OooO0o0 = new ArrayList<>();
        }

        public final void OooO00o() {
            Intent intent = new Intent(Constants.ACTION_LOAD_IMAGE);
            intent.setPackage("com.google.android.gms");
            intent.putExtra(Constants.EXTRA_URI, this.f14985OooO0Oo);
            intent.putExtra(Constants.EXTRA_RESULT_RECEIVER, this);
            intent.putExtra(Constants.EXTRA_PRIORITY, 3);
            ImageManager.this.f14979OooO00o.sendBroadcast(intent);
        }

        @Override // android.os.ResultReceiver
        public final void onReceiveResult(int i, Bundle bundle) {
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) bundle.getParcelable("com.google.android.gms.extra.fileDescriptor");
            ImageManager imageManager = ImageManager.this;
            imageManager.f14981OooO0OO.execute(new OooO00o(imageManager, this.f14985OooO0Oo, parcelFileDescriptor));
        }
    }

    public interface OnImageLoadedListener {
        void onImageLoaded(@NonNull Uri uri, @Nullable Drawable drawable, boolean z);
    }

    public ImageManager(Context context) {
        this.f14979OooO00o = context.getApplicationContext();
        new zak();
        this.f14982OooO0Oo = new HashMap();
        this.f14984OooO0o0 = new HashMap();
        this.f14983OooO0o = new HashMap();
    }

    @NonNull
    public static ImageManager create(@NonNull Context context) {
        if (f14976OooO == null) {
            f14976OooO = new ImageManager(context);
        }
        return f14976OooO;
    }

    public void loadImage(@NonNull ImageView imageView, int i) {
        zaj(new zae(imageView, i));
    }

    public final void zaj(zag zagVar) {
        Asserts.checkMainThread("ImageManager.loadImage() must be called in the main thread");
        new OooO0O0(this, zagVar).run();
    }

    public void loadImage(@NonNull ImageView imageView, @NonNull Uri uri) {
        zaj(new zae(imageView, uri));
    }

    public void loadImage(@NonNull ImageView imageView, @NonNull Uri uri, int i) {
        zae zaeVar = new zae(imageView, uri);
        zaeVar.f15007OooO0O0 = i;
        zaj(zaeVar);
    }

    public void loadImage(@NonNull OnImageLoadedListener onImageLoadedListener, @NonNull Uri uri) {
        zaj(new zaf(onImageLoadedListener, uri));
    }

    public void loadImage(@NonNull OnImageLoadedListener onImageLoadedListener, @NonNull Uri uri, int i) {
        zaf zafVar = new zaf(onImageLoadedListener, uri);
        zafVar.f15007OooO0O0 = i;
        zaj(zafVar);
    }
}
