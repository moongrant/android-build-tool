package o00000OO;

import java.text.CharacterIterator;
import kotlin.jvm.internal.CharCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class OooO00o implements CharacterIterator {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public int f27008Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final CharSequence f27009Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final int f27010Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final int f27011Oooo0oo;

    public OooO00o(@NotNull CharSequence charSequence, int i) {
        Intrinsics.checkNotNullParameter(charSequence, "charSequence");
        this.f27009Oooo0o = charSequence;
        this.f27010Oooo0oO = 0;
        this.f27011Oooo0oo = i;
        this.f27008Oooo = 0;
    }

    @Override // java.text.CharacterIterator
    @NotNull
    public final Object clone() {
        try {
            Object objClone = super.clone();
            Intrinsics.checkNotNullExpressionValue(objClone, "{\n            @Suppress(…  super.clone()\n        }");
            return objClone;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // java.text.CharacterIterator
    public final char current() {
        int i = this.f27008Oooo;
        return i == this.f27011Oooo0oo ? CharCompanionObject.MAX_VALUE : this.f27009Oooo0o.charAt(i);
    }

    @Override // java.text.CharacterIterator
    public final char first() {
        this.f27008Oooo = this.f27010Oooo0oO;
        return current();
    }

    @Override // java.text.CharacterIterator
    public final int getBeginIndex() {
        return this.f27010Oooo0oO;
    }

    @Override // java.text.CharacterIterator
    public final int getEndIndex() {
        return this.f27011Oooo0oo;
    }

    @Override // java.text.CharacterIterator
    public final int getIndex() {
        return this.f27008Oooo;
    }

    @Override // java.text.CharacterIterator
    public final char last() {
        int i = this.f27010Oooo0oO;
        int i2 = this.f27011Oooo0oo;
        if (i == i2) {
            this.f27008Oooo = i2;
            return CharCompanionObject.MAX_VALUE;
        }
        int i3 = i2 - 1;
        this.f27008Oooo = i3;
        return this.f27009Oooo0o.charAt(i3);
    }

    @Override // java.text.CharacterIterator
    public final char next() {
        int i = this.f27008Oooo + 1;
        this.f27008Oooo = i;
        int i2 = this.f27011Oooo0oo;
        if (i < i2) {
            return this.f27009Oooo0o.charAt(i);
        }
        this.f27008Oooo = i2;
        return CharCompanionObject.MAX_VALUE;
    }

    @Override // java.text.CharacterIterator
    public final char previous() {
        int i = this.f27008Oooo;
        if (i <= this.f27010Oooo0oO) {
            return CharCompanionObject.MAX_VALUE;
        }
        int i2 = i - 1;
        this.f27008Oooo = i2;
        return this.f27009Oooo0o.charAt(i2);
    }

    @Override // java.text.CharacterIterator
    public final char setIndex(int i) {
        int i2 = this.f27010Oooo0oO;
        boolean z = false;
        if (i <= this.f27011Oooo0oo && i2 <= i) {
            z = true;
        }
        if (!z) {
            throw new IllegalArgumentException("invalid position");
        }
        this.f27008Oooo = i;
        return current();
    }
}
