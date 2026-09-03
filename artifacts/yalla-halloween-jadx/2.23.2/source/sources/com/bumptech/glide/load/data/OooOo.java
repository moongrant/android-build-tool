package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class OooOo<T> implements OooO0o<T> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Uri f13054OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public T f13055OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final ContentResolver f13056OooO0o0;

    public OooOo(ContentResolver contentResolver, Uri uri) {
        this.f13056OooO0o0 = contentResolver;
        this.f13054OooO0Oo = uri;
    }

    @Override // com.bumptech.glide.load.data.OooO0o
    public final void OooO0O0() {
        T t = this.f13055OooO0o;
        if (t != null) {
            try {
                OooO0OO(t);
            } catch (IOException unused) {
            }
        }
    }

    public abstract void OooO0OO(T t) throws IOException;

    /* JADX WARN: Type inference failed for: r3v3, types: [T, java.lang.Object] */
    @Override // com.bumptech.glide.load.data.OooO0o
    public final void OooO0Oo(@NonNull Priority priority, @NonNull OooO0o.OooO00o<? super T> oooO00o) {
        try {
            ?? r3 = (T) OooO0o0(this.f13056OooO0o0, this.f13054OooO0Oo);
            this.f13055OooO0o = r3;
            oooO00o.OooO0o0(r3);
        } catch (FileNotFoundException e) {
            if (Log.isLoggable("LocalUriFetcher", 3)) {
                Log.d("LocalUriFetcher", "Failed to open Uri", e);
            }
            oooO00o.OooO0OO(e);
        }
    }

    public abstract Object OooO0o0(ContentResolver contentResolver, Uri uri) throws FileNotFoundException;

    @Override // com.bumptech.glide.load.data.OooO0o
    public final void cancel() {
    }

    @Override // com.bumptech.glide.load.data.OooO0o
    @NonNull
    public final DataSource getDataSource() {
        return DataSource.LOCAL;
    }
}
