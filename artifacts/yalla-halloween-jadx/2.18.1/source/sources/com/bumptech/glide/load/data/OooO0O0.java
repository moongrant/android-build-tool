package com.bumptech.glide.load.data;

import android.content.res.AssetManager;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class OooO0O0<T> implements OooO0o<T> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final String f12464Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final AssetManager f12465Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public T f12466Oooo0oo;

    public OooO0O0(AssetManager assetManager, String str) {
        this.f12465Oooo0oO = assetManager;
        this.f12464Oooo0o = str;
    }

    @Override // com.bumptech.glide.load.data.OooO0o
    public final void OooO0O0() {
        T t = this.f12466Oooo0oo;
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
    @NonNull
    public final DataSource OooO0Oo() {
        return DataSource.LOCAL;
    }

    public abstract T OooO0o(AssetManager assetManager, String str) throws IOException;

    @Override // com.bumptech.glide.load.data.OooO0o
    public final void OooO0o0(@NonNull Priority priority, @NonNull OooO0o.OooO00o<? super T> oooO00o) {
        try {
            T tOooO0o = OooO0o(this.f12465Oooo0oO, this.f12464Oooo0o);
            this.f12466Oooo0oo = tOooO0o;
            oooO00o.OooO0o(tOooO0o);
        } catch (IOException e) {
            if (Log.isLoggable("AssetPathFetcher", 3)) {
                Log.d("AssetPathFetcher", "Failed to load data from asset manager", e);
            }
            oooO00o.OooO0OO(e);
        }
    }

    @Override // com.bumptech.glide.load.data.OooO0o
    public final void cancel() {
    }
}
