package p539o0o0Oo00;

import com.yalla.yalla.developer.crash.CrashListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOO0O extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ CrashListViewModel f44132Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOO0O(CrashListViewModel crashListViewModel) {
        super(0);
        this.f44132Oooo0o = crashListViewModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f44132Oooo0o.clearFiles();
        return Unit.INSTANCE;
    }
}
