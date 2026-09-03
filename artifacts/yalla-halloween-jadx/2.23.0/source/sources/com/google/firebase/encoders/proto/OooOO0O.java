package com.google.firebase.encoders.proto;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.encoders.EncodingException;
import java.io.IOException;
import p294o0O0Ooo0.o0000O0;
import p294o0O0Ooo0.o0000OO0;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOO0O implements o0000OO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public boolean f20169OooO00o = false;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public boolean f20170OooO0O0 = false;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public o0000O0 f20171OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooO0o f20172OooO0Oo;

    public OooOO0O(OooO0o oooO0o) {
        this.f20172OooO0Oo = oooO0o;
    }

    @Override // p294o0O0Ooo0.o0000OO0
    @NonNull
    public final o0000OO0 OooO0O0(@Nullable String str) throws IOException {
        if (this.f20169OooO00o) {
            throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f20169OooO00o = true;
        this.f20172OooO0Oo.OooO0O0(this.f20171OooO0OO, str, this.f20170OooO0O0);
        return this;
    }

    @Override // p294o0O0Ooo0.o0000OO0
    @NonNull
    public final o0000OO0 OooO0Oo(boolean z) throws IOException {
        if (this.f20169OooO00o) {
            throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f20169OooO00o = true;
        this.f20172OooO0Oo.OooO0Oo(this.f20171OooO0OO, z ? 1 : 0, this.f20170OooO0O0);
        return this;
    }
}
