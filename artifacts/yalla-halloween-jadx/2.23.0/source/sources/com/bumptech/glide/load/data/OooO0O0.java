package com.bumptech.glide.load.data;

import android.content.res.AssetManager;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class OooO0O0<T> implements OooO0o<T> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final String f9944OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public T f9945OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final AssetManager f9946OooO0o0;

    public OooO0O0(AssetManager assetManager, String str) {
        this.f9946OooO0o0 = assetManager;
        this.f9944OooO0Oo = str;
    }

    @Override // com.bumptech.glide.load.data.OooO0o
    public final void OooO0O0() {
        T t = this.f9945OooO0o;
        if (t == null) {
            return;
        }
        try {
            OooO0OO(t);
        } catch (IOException unused) {
        }
    }

    public abstract void OooO0OO(T t) throws IOException;

    @Override // com.bumptech.glide.load.data.OooO0o
    public final void OooO0Oo(@NonNull Priority priority, @NonNull OooO0o.OooO00o<? super T> oooO00o) {
        try {
            T tOooO0o0 = OooO0o0(this.f9946OooO0o0, this.f9944OooO0Oo);
            this.f9945OooO0o = tOooO0o0;
            oooO00o.OooO0o0(tOooO0o0);
        } catch (IOException e) {
            if (Log.isLoggable("AssetPathFetcher", 3)) {
                Log.d("AssetPathFetcher", "Failed to load data from asset manager", e);
            }
            oooO00o.OooO0OO(e);
        }
    }

    public abstract T OooO0o0(AssetManager assetManager, String str) throws IOException;

    @Override // com.bumptech.glide.load.data.OooO0o
    public final void cancel() {
    }

    @Override // com.bumptech.glide.load.data.OooO0o
    @NonNull
    public final DataSource getDataSource() {
        return DataSource.LOCAL;
    }
}
