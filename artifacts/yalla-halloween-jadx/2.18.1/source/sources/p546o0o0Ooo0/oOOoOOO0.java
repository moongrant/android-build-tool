package p546o0o0Ooo0;

import com.app.base.protobuf.room.Room;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p159o00OoOO.o00O000;

/* JADX INFO: loaded from: classes2.dex */
public final class oOOoOOO0 extends Lambda implements Function2<String, Integer, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public static final oOOoOOO0 f44585Oooo0o = new oOOoOOO0();

    public oOOoOOO0() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(String str, Integer num) {
        String gifUrl = str;
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(gifUrl, "gifUrl");
        Objects.requireNonNull(o00O000.OooO());
        if (o00O000.f32468OooO00o != null) {
            Room.GifMoticonRequest.Builder builderNewBuilder = Room.GifMoticonRequest.newBuilder();
            builderNewBuilder.setGifid(iIntValue);
            builderNewBuilder.setGifurl(gifUrl);
            o00O000.f32468OooO00o.OooO0oO(10067, builderNewBuilder.build().toByteArray());
        }
        return Unit.INSTANCE;
    }
}
