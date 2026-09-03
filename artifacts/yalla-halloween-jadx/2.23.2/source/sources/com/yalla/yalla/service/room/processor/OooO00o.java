package com.yalla.yalla.service.room.processor;

import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p598o0oo00Oo.o0000O00;

/* JADX INFO: loaded from: classes4.dex */
public interface OooO00o {

    /* JADX INFO: renamed from: com.yalla.yalla.service.room.processor.OooO00o$OooO00o, reason: collision with other inner class name */
    @SourceDebugExtension({"SMAP\nIRoomMsgProcessor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IRoomMsgProcessor.kt\ncom/yalla/yalla/service/room/processor/IRoomMsgProcessor$DefaultImpls\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,15:1\n1#2:16\n*E\n"})
    public static final class C0318OooO00o {
        @NotNull
        public static String OooO00o(@NotNull OooO00o oooO00o) {
            String simpleName = oooO00o.getClass().getSimpleName();
            Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
            return simpleName;
        }

        @Deprecated(message = "在RoomMessageDispatcher中解析好后直接传进来处理")
        public static void OooO0O0(@NotNull OooO00o oooO00o, int i, @Nullable Object obj) {
            o0000O00.OooO0OO(oooO00o.OooO00o(), "type = " + i + ", data = " + (obj != null ? p187o00o00o0.OooO.OooO00o(obj) : ""));
        }
    }

    @NotNull
    String OooO00o();
}
