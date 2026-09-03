package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class OooOo<T> implements OooO0o<T> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final Uri f12484Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final ContentResolver f12485Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public T f12486Oooo0oo;

    public OooOo(ContentResolver contentResolver, Uri uri) {
        this.f12485Oooo0oO = contentResolver;
        this.f12484Oooo0o = uri;
    }

    @Override // com.bumptech.glide.load.data.OooO0o
    public final void OooO0O0() {
        T t = this.f12486Oooo0oo;
        if (t != null) {
            try {
                OooO0OO(t);
            } catch (IOException unused) {
            }
        }
    }

    public abstract void OooO0OO(T t) throws IOException;

    @Override // com.bumptech.glide.load.data.OooO0o
    @NonNull
    public final DataSource OooO0Oo() {
        return DataSource.LOCAL;
    }

    public abstract T OooO0o(Uri uri, ContentResolver contentResolver) throws FileNotFoundException;

    @Override // com.bumptech.glide.load.data.OooO0o
    public final void OooO0o0(@NonNull Priority priority, @NonNull OooO0o.OooO00o<? super T> oooO00o) {
        try {
            T tOooO0o = OooO0o(this.f12484Oooo0o, this.f12485Oooo0oO);
            this.f12486Oooo0oo = tOooO0o;
            oooO00o.OooO0o(tOooO0o);
        } catch (FileNotFoundException e) {
            if (Log.isLoggable("LocalUriFetcher", 3)) {
                Log.d("LocalUriFetcher", "Failed to open Uri", e);
            }
            oooO00o.OooO0OO(e);
        }
    }

    @Override // com.bumptech.glide.load.data.OooO0o
    public final void cancel() {
    }
}
