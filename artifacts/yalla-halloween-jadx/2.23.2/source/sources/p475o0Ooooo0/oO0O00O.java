package p475o0Ooooo0;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0O00O extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Map<String, String> f48100OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0O00O(LinkedHashMap linkedHashMap) {
        super(0);
        this.f48100OooO0Oo = linkedHashMap;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f48100OooO0Oo.put("isVideo", "1");
        return Unit.INSTANCE;
    }
}
