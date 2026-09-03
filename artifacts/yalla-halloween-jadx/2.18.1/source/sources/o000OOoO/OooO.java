package o000OOoO;

import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.emoji2.text.EmojiCompat;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(19)
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class OooO implements KeyListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final KeyListener f28289OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO00o f28290OooO0O0;

    public static class OooO00o {
    }

    public OooO(KeyListener keyListener) {
        OooO00o oooO00o = new OooO00o();
        this.f28289OooO00o = keyListener;
        this.f28290OooO0O0 = oooO00o;
    }

    @Override // android.text.method.KeyListener
    public final void clearMetaKeyState(View view, Editable editable, int i) {
        this.f28289OooO00o.clearMetaKeyState(view, editable, i);
    }

    @Override // android.text.method.KeyListener
    public final int getInputType() {
        return this.f28289OooO00o.getInputType();
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyDown(View view, Editable editable, int i, KeyEvent keyEvent) {
        boolean zOooO00o;
        boolean z;
        Objects.requireNonNull(this.f28290OooO0O0);
        Object obj = EmojiCompat.f8079OooO;
        if (i != 67) {
            zOooO00o = i != 112 ? false : androidx.emoji2.text.OooOO0O.OooO00o(editable, keyEvent, true);
        } else {
            zOooO00o = androidx.emoji2.text.OooOO0O.OooO00o(editable, keyEvent, false);
        }
        if (zOooO00o) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            z = true;
        } else {
            z = false;
        }
        return z || this.f28289OooO00o.onKeyDown(view, editable, i, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f28289OooO00o.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyUp(View view, Editable editable, int i, KeyEvent keyEvent) {
        return this.f28289OooO00o.onKeyUp(view, editable, i, keyEvent);
    }
}
