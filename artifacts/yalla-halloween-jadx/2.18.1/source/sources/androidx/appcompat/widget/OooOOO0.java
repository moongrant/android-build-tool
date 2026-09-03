package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.emoji2.text.EmojiCompat;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final EditText f5097OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final o000OOoO.OooO00o f5098OooO0O0;

    public OooOOO0(@NonNull EditText editText) {
        this.f5097OooO00o = editText;
        this.f5098OooO0O0 = new o000OOoO.OooO00o(editText);
    }

    @Nullable
    public final KeyListener OooO00o(@Nullable KeyListener keyListener) {
        if (!(!(keyListener instanceof NumberKeyListener))) {
            return keyListener;
        }
        Objects.requireNonNull(this.f5098OooO0O0.f28291OooO00o);
        if (keyListener instanceof o000OOoO.OooO) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new o000OOoO.OooO(keyListener);
    }

    public final void OooO0O0(@Nullable AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = this.f5097OooO00o.getContext().obtainStyledAttributes(attributeSet, OooOo00.OooOOOO.AppCompatTextView, i, 0);
        try {
            int i2 = OooOo00.OooOOOO.AppCompatTextView_emojiCompatEnabled;
            boolean z = typedArrayObtainStyledAttributes.hasValue(i2) ? typedArrayObtainStyledAttributes.getBoolean(i2, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            OooO0Oo(z);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    @Nullable
    public final InputConnection OooO0OO(@Nullable InputConnection inputConnection, @NonNull EditorInfo editorInfo) {
        o000OOoO.OooO00o oooO00o = this.f5098OooO0O0;
        Objects.requireNonNull(oooO00o);
        if (inputConnection == null) {
            return null;
        }
        o000OOoO.OooO00o.C0301OooO00o c0301OooO00o = oooO00o.f28291OooO00o;
        Objects.requireNonNull(c0301OooO00o);
        return inputConnection instanceof o000OOoO.OooO0OO ? inputConnection : new o000OOoO.OooO0OO(c0301OooO00o.f28292OooO00o, inputConnection, editorInfo);
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [OooOooo.o0OoOo0, java.util.Set<androidx.emoji2.text.EmojiCompat$OooO>] */
    public final void OooO0Oo(boolean z) {
        o000OOoO.OooOO0O oooOO0O = this.f5098OooO0O0.f28291OooO00o.f28293OooO0O0;
        if (oooOO0O.f28308Oooo != z) {
            if (oooOO0O.f28311Oooo0oo != null) {
                EmojiCompat emojiCompatOooO00o = EmojiCompat.OooO00o();
                o000OOoO.OooOO0O.OooO00o oooO00o = oooOO0O.f28311Oooo0oo;
                Objects.requireNonNull(emojiCompatOooO00o);
                o000OO0O.OooOOO0.OooO0Oo(oooO00o, "initCallback cannot be null");
                emojiCompatOooO00o.f8081OooO00o.writeLock().lock();
                try {
                    emojiCompatOooO00o.f8082OooO0O0.remove(oooO00o);
                    emojiCompatOooO00o.f8081OooO00o.writeLock().unlock();
                } catch (Throwable th) {
                    emojiCompatOooO00o.f8081OooO00o.writeLock().unlock();
                    throw th;
                }
            }
            oooOO0O.f28308Oooo = z;
            if (z) {
                o000OOoO.OooOO0O.OooO00o(oooOO0O.f28309Oooo0o, EmojiCompat.OooO00o().OooO0O0());
            }
        }
    }
}
