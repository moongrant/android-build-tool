package com.squareup.picasso;

import android.content.Context;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public class OooOO0O extends o00oO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f21720OooO00o;

    public OooOO0O(Context context) {
        this.f21720OooO00o = context;
    }

    @Override // com.squareup.picasso.o00oO0o
    public boolean OooO0O0(o00Ooo o00ooo2) {
        return "content".equals(o00ooo2.f21794OooO0Oo.getScheme());
    }

    @Override // com.squareup.picasso.o00oO0o
    public o00oO0o.OooO00o OooO0o0(o00Ooo o00ooo2) throws IOException {
        return new o00oO0o.OooO00o(OooO0oO(o00ooo2), Picasso.LoadedFrom.DISK);
    }

    public final InputStream OooO0oO(o00Ooo o00ooo2) throws FileNotFoundException {
        return this.f21720OooO00o.getContentResolver().openInputStream(o00ooo2.f21794OooO0Oo);
    }
}
