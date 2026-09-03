package o00OO0O0;

import com.app.base.model.ChatModel;
import com.weieyu.yalla.R;
import java.util.Map;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class o00oO0o extends Lambda implements Function1<ChatModel, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o0OO00O f31577Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00oO0o(o0OO00O o0oo00o2) {
        super(1);
        this.f31577Oooo0o = o0oo00o2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ChatModel chatModel) {
        ChatModel chatModel2 = chatModel;
        Intrinsics.checkNotNullParameter(chatModel2, "chatModel");
        Oooo0 oooo0 = (Oooo0) this.f31577Oooo0o.f31589Oooo0oo.getValue();
        Objects.requireNonNull(oooo0);
        Intrinsics.checkNotNullParameter(chatModel2, "chatModel");
        if (!oooo0.f31410OooO0O0) {
            oooo0.f31410OooO0O0 = true;
            String str = chatModel2.id;
            OooOo00 oooOo00 = new OooOo00(oooo0, chatModel2, oooo0.f31409OooO00o);
            Map<String, String> mapOooO0O0 = p160o00OoOO0.o00OO0O0.OooO0O0();
            mapOooO0O0.put("redid", str);
            oooOo00.setHaveBeforeAfter(true);
            oooOo00.setTitle(p254o00ooO0O.o000O0O0.OooO0OO(R.string.loading));
            p153o00Oo0oO.o0ooOOo o0ooooo2 = p153o00Oo0oO.o0ooOOo.f32218OooO00o;
            p160o00OoOO0.o00OO0O0.OooO0OO(null, p153o00Oo0oO.o0ooOOo.f32244OooOoo, p153o00Oo0oO.o0ooOOo.f32250Oooo000, mapOooO0O0, oooOo00);
        }
        return Unit.INSTANCE;
    }
}
