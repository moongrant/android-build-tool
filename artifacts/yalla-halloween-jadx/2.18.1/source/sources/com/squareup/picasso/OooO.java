package com.squareup.picasso;

import android.content.Context;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public class OooO extends o0OoOo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f19689OooO00o;

    public OooO(Context context) {
        this.f19689OooO00o = context;
    }

    @Override // com.squareup.picasso.o0OoOo0
    public boolean OooO0OO(Oooo0 oooo0) {
        return "content".equals(oooo0.f19769OooO0Oo.getScheme());
    }

    @Override // com.squareup.picasso.o0OoOo0
    public o0OoOo0.OooO00o OooO0o(Oooo0 oooo0) throws IOException {
        return new o0OoOo0.OooO00o(OooO0oo(oooo0), Picasso.LoadedFrom.DISK);
    }

    public final InputStream OooO0oo(Oooo0 oooo0) throws FileNotFoundException {
        return this.f19689OooO00o.getContentResolver().openInputStream(oooo0.f19769OooO0Oo);
    }
}
