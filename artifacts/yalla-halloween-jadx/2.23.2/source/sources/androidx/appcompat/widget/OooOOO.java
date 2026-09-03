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
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final EditText f2977OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final p061o0000o0O.o00oO0o f2978OooO0O0;

    public OooOOO(@NonNull EditText editText) {
        this.f2977OooO00o = editText;
        this.f2978OooO0O0 = new p061o0000o0O.o00oO0o(editText);
    }

    @Nullable
    public final KeyListener OooO00o(@Nullable KeyListener keyListener) {
        if (!(!(keyListener instanceof NumberKeyListener))) {
            return keyListener;
        }
        this.f2978OooO0O0.f33753OooO00o.getClass();
        if (keyListener instanceof p061o0000o0O.o0OO00O) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new p061o0000o0O.o0OO00O(keyListener);
    }

    public final void OooO0O0(@Nullable AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = this.f2977OooO00o.getContext().obtainStyledAttributes(attributeSet, p012OooOo0O.o00O0O.AppCompatTextView, i, 0);
        try {
            int i2 = p012OooOo0O.o00O0O.AppCompatTextView_emojiCompatEnabled;
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
        p061o0000o0O.o00oO0o o00oo0o2 = this.f2978OooO0O0;
        if (inputConnection == null) {
            o00oo0o2.getClass();
            return null;
        }
        o0000o0O.o00oO0o.OooO00o oooO00o = o00oo0o2.f33753OooO00o;
        oooO00o.getClass();
        return inputConnection instanceof p061o0000o0O.o0OOO0o ? inputConnection : new p061o0000o0O.o0OOO0o(oooO00o.f33754OooO00o, inputConnection, editorInfo);
    }

    public final void OooO0Oo(boolean z) {
        p061o0000o0O.o0O0O00 o0o0o00 = this.f2978OooO0O0.f33753OooO00o.f33755OooO0O0;
        if (o0o0o00.f33759OooO0oO != z) {
            if (o0o0o00.f33757OooO0o != null) {
                EmojiCompat emojiCompatOooO00o = EmojiCompat.OooO00o();
                o0000o0O.o0O0O00.OooO00o oooO00o = o0o0o00.f33757OooO0o;
                emojiCompatOooO00o.getClass();
                o000OO.OooOOO0.OooO0o0(oooO00o, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = emojiCompatOooO00o.f5600OooO00o;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    emojiCompatOooO00o.f5601OooO0O0.remove(oooO00o);
                    reentrantReadWriteLock.writeLock().unlock();
                } catch (Throwable th) {
                    reentrantReadWriteLock.writeLock().unlock();
                    throw th;
                }
            }
            o0o0o00.f33759OooO0oO = z;
            if (z) {
                p061o0000o0O.o0O0O00.OooO00o(o0o0o00.f33756OooO0Oo, EmojiCompat.OooO00o().OooO0O0());
            }
        }
    }
}
