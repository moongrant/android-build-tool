package o0OOO0O;

import android.content.Context;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public abstract class OooO00o implements OooO0OO {

    @Nullable
    private OooO0OO.OooO00o completionListener;

    @Nullable
    private OooO0OO.OooO0O0 errorListener;

    @Nullable
    private OooO0OO.InterfaceC0458OooO0OO firstFrameListener;

    @Nullable
    private OooO0OO.OooO0o preparedListener;

    /* JADX WARN: Multi-variable type inference failed */
    public OooO00o() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public OooO00o(@Nullable Context context) {
    }

    @Nullable
    public final OooO0OO.OooO00o getCompletionListener() {
        return this.completionListener;
    }

    @Nullable
    public final OooO0OO.OooO0O0 getErrorListener() {
        return this.errorListener;
    }

    @Nullable
    public final OooO0OO.InterfaceC0458OooO0OO getFirstFrameListener() {
        return this.firstFrameListener;
    }

    @Nullable
    public final OooO0OO.OooO0o getPreparedListener() {
        return this.preparedListener;
    }

    public final void setCompletionListener(@Nullable OooO0OO.OooO00o oooO00o) {
        this.completionListener = oooO00o;
    }

    public final void setErrorListener(@Nullable OooO0OO.OooO0O0 oooO0O0) {
        this.errorListener = oooO0O0;
    }

    public final void setFirstFrameListener(@Nullable OooO0OO.InterfaceC0458OooO0OO interfaceC0458OooO0OO) {
        this.firstFrameListener = interfaceC0458OooO0OO;
    }

    @Override // o0OOO0O.OooO0OO
    public void setOnCompletionListener(@NotNull OooO0OO.OooO00o oooO00o) {
        this.completionListener = oooO00o;
    }

    @Override // o0OOO0O.OooO0OO
    public void setOnErrorListener(@NotNull OooO0OO.OooO0O0 oooO0O0) {
        this.errorListener = oooO0O0;
    }

    @Override // o0OOO0O.OooO0OO
    public void setOnFirstFrameListener(@NotNull OooO0OO.InterfaceC0458OooO0OO interfaceC0458OooO0OO) {
        this.firstFrameListener = interfaceC0458OooO0OO;
    }

    @Override // o0OOO0O.OooO0OO
    public void setOnPreparedListener(@NotNull OooO0OO.OooO0o oooO0o) {
        this.preparedListener = oooO0o;
    }

    public final void setPreparedListener(@Nullable OooO0OO.OooO0o oooO0o) {
        this.preparedListener = oooO0o;
    }

    public /* synthetic */ OooO00o(Context context, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : context);
    }
}
