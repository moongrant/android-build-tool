package com.google.firebase.encoders.proto;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.encoders.EncodingException;
import java.io.IOException;
import p368o0OOo0O.Oooo0;
import p368o0OOo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOO0O implements o00Oo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public boolean f19108OooO00o = false;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public boolean f19109OooO0O0 = false;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public Oooo0 f19110OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooO0o f19111OooO0Oo;

    public OooOO0O(OooO0o oooO0o) {
        this.f19111OooO0Oo = oooO0o;
    }

    @Override // p368o0OOo0O.o00Oo0
    @NonNull
    public final o00Oo0 OooO0o(boolean z) throws IOException {
        if (this.f19108OooO00o) {
            throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f19108OooO00o = true;
        this.f19111OooO0Oo.OooO0o0(this.f19110OooO0OO, z ? 1 : 0, this.f19109OooO0O0);
        return this;
    }

    @Override // p368o0OOo0O.o00Oo0
    @NonNull
    public final o00Oo0 OooO0o0(@Nullable String str) throws IOException {
        if (this.f19108OooO00o) {
            throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f19108OooO00o = true;
        this.f19111OooO0Oo.OooO0oO(this.f19110OooO0OO, str, this.f19109OooO0O0);
        return this;
    }
}
