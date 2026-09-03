package com.yalla.yalla.service.room.processor;

import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public interface OooO00o {

    /* JADX INFO: renamed from: com.yalla.yalla.service.room.processor.OooO00o$OooO00o, reason: collision with other inner class name */
    @SourceDebugExtension({"SMAP\nIRoomMsgProcessor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IRoomMsgProcessor.kt\ncom/yalla/yalla/service/room/processor/IRoomMsgProcessor$DefaultImpls\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,15:1\n1#2:16\n*E\n"})
    public static final class C0319OooO00o {
        @NotNull
        public static String OooO00o(@NotNull OooO00o oooO00o) {
            String simpleName = oooO00o.getClass().getSimpleName();
            Intrinsics.checkNotNullExpressionValue(simpleName, "this.javaClass.simpleName");
            return simpleName;
        }

        @Deprecated(message = "在RoomMessageDispatcher中解析好后直接传进来处理")
        public static void OooO0O0(@NotNull OooO00o oooO00o, int i, @Nullable Object obj) {
            p592o0oo00O.OooOOO0.OooO0OO(oooO00o.OooO00o(), "type = " + i + ", data = " + (obj != null ? p140o00OOooo.OooOO0.OooO00o(obj) : ""));
        }
    }

    @NotNull
    String OooO00o();
}
