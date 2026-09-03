package com.app.base.http;

import androidx.compose.runtime.internal.StabilityInferred;
import com.app.base.interfaceType.FeedbackType;
import com.yalla.support.common.util.OooO;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153o00Oo0oO.o0ooOOo;
import p160o00OoOO0.o00OO0O0;
import p522o0o0O0o.o00O0;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b.\u0010/J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u001e\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002J&\u0010\r\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002J=\u0010\u0013\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0016\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002J\u001e\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002J\u001e\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002J\u001e\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002J\u001e\u0010 \u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\"\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010#\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0018\u0010$\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u0002J\u0018\u0010&\u001a\u00020\u00042\b\u0010%\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u0002J.\u0010*\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010'\u001a\u00020\b2\u0006\u0010)\u001a\u00020(2\u0006\u0010\u0003\u001a\u00020\u0002J&\u0010,\u001a\u00020\u00042\u0006\u0010+\u001a\u00020(2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010-\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002¨\u00060"}, d2 = {"Lcom/app/base/http/ApiTopic;", "", "Lo00OoOO0/o00OO0O0$OooO0O0;", "callback", "", "checkCreateTopicState", "", "topicName", "", "type", "checkTopicInfoAvailable", "topicImage", "introduction", "createTopic", "pageIndex", "loadJoinTopic", "touserid", "datesort", "pageindex", "circlePersonal", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Lo00OoOO0/o00OO0O0$OooO0O0;)V", "circleId", "circleSingle", "id", "cirImage", "circleInfoEditImage", "cirDescribe", "circleInfoEditDesc", "cirRule", "circleInfoEditRule", "", "join", "circleJoinIns", "search", "circleSearch", "circleSearchRmdList", "circleUserVerify", "dyId", "getCircleInfoByDyId", "pageSize", "", "dateSort", "circleMemberList", "topicId", "circleBlackList", "circleAdmin", "<init>", "()V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class ApiTopic {
    public static final int $stable = 0;

    public final void checkCreateTopicState(@NotNull o00OO0O0.OooO0O0 callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        Map<String, String> mapOooO0O0 = o00OO0O0.OooO0O0();
        o0ooOOo o0ooooo2 = o0ooOOo.f32218OooO00o;
        o00OO0O0.OooO0OO(null, o0ooOOo.f32298o0000OOo, o0ooOOo.f32308o0000oO0, mapOooO0O0, callback);
    }

    public final void checkTopicInfoAvailable(@NotNull String topicName, int type, @NotNull o00OO0O0.OooO0O0 callback) {
        Intrinsics.checkNotNullParameter(topicName, "topicName");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Map<String, String> params = o00OO0O0.OooO0O0();
        Intrinsics.checkNotNullExpressionValue(params, "params");
        params.put("checkValue", topicName);
        params.put("type", String.valueOf(type));
        o0ooOOo o0ooooo2 = o0ooOOo.f32218OooO00o;
        o00OO0O0.OooO0OO(null, o0ooOOo.f32298o0000OOo, o0ooOOo.f32309o0000oOO, params, callback);
    }

    public final void circleAdmin(@NotNull String circleId, @NotNull o00OO0O0.OooO0O0 callback) {
        Intrinsics.checkNotNullParameter(circleId, "circleId");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Map<String, String> params = o00OO0O0.OooO0O0();
        Intrinsics.checkNotNullExpressionValue(params, "params");
        params.put("circleid", circleId);
        o0ooOOo o0ooooo2 = o0ooOOo.f32218OooO00o;
        o00OO0O0.OooO0OO(null, o0ooOOo.f32298o0000OOo, "/Webservers/Circle/CircleAdmin", params, callback);
    }

    public final void circleBlackList(long topicId, int pageIndex, @NotNull String datesort, @NotNull o00OO0O0.OooO0O0 callback) {
        Intrinsics.checkNotNullParameter(datesort, "datesort");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Map<String, String> params = o00OO0O0.OooO0O0();
        Intrinsics.checkNotNullExpressionValue(params, "params");
        params.put("circleid", String.valueOf(topicId));
        params.put("pageindex", String.valueOf(pageIndex));
        params.put("datesort", datesort);
        o0ooOOo o0ooooo2 = o0ooOOo.f32218OooO00o;
        o00OO0O0.OooO0OO(null, o0ooOOo.f32298o0000OOo, "/Webservers/Circle/CircleBlackList", params, callback);
    }

    public final void circleInfoEditDesc(@NotNull String id, @NotNull String cirDescribe, @NotNull o00OO0O0.OooO0O0 callback) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(cirDescribe, "cirDescribe");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Map<String, String> params = o00OO0O0.OooO0O0();
        Intrinsics.checkNotNullExpressionValue(params, "params");
        params.put("id", id);
        params.put("cirDescribe", cirDescribe);
        o0ooOOo o0ooooo2 = o0ooOOo.f32218OooO00o;
        o00OO0O0.OooO0Oo(null, o0ooOOo.f32298o0000OOo, o0ooOOo.f32312o0000oo0, params, callback);
    }

    public final void circleInfoEditImage(@NotNull String id, @NotNull String cirImage, @NotNull o00OO0O0.OooO0O0 callback) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(cirImage, "cirImage");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Map<String, String> params = o00OO0O0.OooO0O0();
        Intrinsics.checkNotNullExpressionValue(params, "params");
        params.put("id", id);
        params.put("cirImage", cirImage);
        o0ooOOo o0ooooo2 = o0ooOOo.f32218OooO00o;
        o00OO0O0.OooO0Oo(null, o0ooOOo.f32298o0000OOo, o0ooOOo.f32312o0000oo0, params, callback);
    }

    public final void circleInfoEditRule(@NotNull String id, @NotNull String cirRule, @NotNull o00OO0O0.OooO0O0 callback) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(cirRule, "cirRule");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Map<String, String> params = o00OO0O0.OooO0O0();
        Intrinsics.checkNotNullExpressionValue(params, "params");
        params.put("id", id);
        params.put("cirRule", cirRule);
        o0ooOOo o0ooooo2 = o0ooOOo.f32218OooO00o;
        o00OO0O0.OooO0Oo(null, o0ooOOo.f32298o0000OOo, o0ooOOo.f32312o0000oo0, params, callback);
    }

    public final void circleJoinIns(@NotNull String circleId, boolean join, @NotNull o00OO0O0.OooO0O0 callback) {
        Intrinsics.checkNotNullParameter(circleId, "circleId");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Map<String, String> params = o00OO0O0.OooO0O0();
        Intrinsics.checkNotNullExpressionValue(params, "params");
        params.put("circleid", circleId);
        params.put("type", join ? "1" : FeedbackType.Suggestions);
        o0ooOOo o0ooooo2 = o0ooOOo.f32218OooO00o;
        o00OO0O0.OooO0OO(null, o0ooOOo.f32298o0000OOo, "/Webservers/Circle/CircleJoinIns", params, callback);
    }

    public final void circleMemberList(@NotNull String circleId, int pageIndex, int pageSize, long dateSort, @NotNull o00OO0O0.OooO0O0 callback) {
        Intrinsics.checkNotNullParameter(circleId, "circleId");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Map<String, String> params = o00OO0O0.OooO0O0();
        Intrinsics.checkNotNullExpressionValue(params, "params");
        params.put("circleid", circleId);
        params.put("pageindex", OooO.OooO0oo(Integer.valueOf(pageIndex), ""));
        params.put("pagesize", OooO.OooO0oo(Integer.valueOf(pageSize), ""));
        params.put("datesort", OooO.OooO(Long.valueOf(dateSort), ""));
        o0ooOOo o0ooooo2 = o0ooOOo.f32218OooO00o;
        o00OO0O0.OooO0OO(null, o0ooOOo.f32298o0000OOo, "/Webservers/Circle/CircleMemberlist", params, callback);
    }

    public final void circlePersonal(@Nullable String touserid, @Nullable Integer type, @Nullable String datesort, @Nullable Integer pageindex, @NotNull o00OO0O0.OooO0O0 callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        Map<String, String> params = o00OO0O0.OooO0O0();
        Intrinsics.checkNotNullExpressionValue(params, "params");
        params.put("pageindex", String.valueOf(pageindex));
        params.put("touserid", touserid);
        params.put("type", String.valueOf(type));
        if (datesort != null) {
            params.put("datesort", datesort);
        }
        o0ooOOo o0ooooo2 = o0ooOOo.f32218OooO00o;
        o00OO0O0.OooO0OO(null, o0ooOOo.f32298o0000OOo, o0ooOOo.f32322o000OoO, params, callback);
    }

    public final void circleSearch(@NotNull String search, @NotNull o00OO0O0.OooO0O0 callback) {
        Intrinsics.checkNotNullParameter(search, "search");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Map<String, String> params = o00OO0O0.OooO0O0();
        Intrinsics.checkNotNullExpressionValue(params, "params");
        params.put("search", o00O0.OooO(search));
        o0ooOOo o0ooooo2 = o0ooOOo.f32218OooO00o;
        o00OO0O0.OooO0OO(null, o0ooOOo.f32298o0000OOo, o0ooOOo.f32278o000, params, callback);
    }

    public final void circleSearchRmdList(@NotNull o00OO0O0.OooO0O0 callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        Map<String, String> mapOooO0O0 = o00OO0O0.OooO0O0();
        o0ooOOo o0ooooo2 = o0ooOOo.f32218OooO00o;
        o00OO0O0.OooO0OO(null, o0ooOOo.f32298o0000OOo, o0ooOOo.f32316o000O000, mapOooO0O0, callback);
    }

    public final void circleSingle(@NotNull String circleId, @NotNull o00OO0O0.OooO0O0 callback) {
        Intrinsics.checkNotNullParameter(circleId, "circleId");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Map<String, String> params = o00OO0O0.OooO0O0();
        Intrinsics.checkNotNullExpressionValue(params, "params");
        params.put("circleid", circleId);
        o0ooOOo o0ooooo2 = o0ooOOo.f32218OooO00o;
        o00OO0O0.OooO0OO(null, o0ooOOo.f32298o0000OOo, o0ooOOo.f32313o0000ooO, params, callback);
    }

    public final void circleUserVerify(@Nullable String circleId, @NotNull o00OO0O0.OooO0O0 callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        Map<String, String> params = o00OO0O0.OooO0O0();
        Intrinsics.checkNotNullExpressionValue(params, "params");
        params.put("circleid", circleId);
        o0ooOOo o0ooooo2 = o0ooOOo.f32218OooO00o;
        o00OO0O0.OooO0OO(null, o0ooOOo.f32298o0000OOo, o0ooOOo.f32303o0000o, params, callback);
    }

    public final void createTopic(@NotNull String topicImage, @NotNull String topicName, @NotNull String introduction, @NotNull o00OO0O0.OooO0O0 callback) {
        Intrinsics.checkNotNullParameter(topicImage, "topicImage");
        Intrinsics.checkNotNullParameter(topicName, "topicName");
        Intrinsics.checkNotNullParameter(introduction, "introduction");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Map<String, String> params = o00OO0O0.OooO0O0();
        Intrinsics.checkNotNullExpressionValue(params, "params");
        params.put("cirImage", topicImage);
        params.put("cirName", topicName);
        params.put("cirDescribe", introduction);
        o0ooOOo o0ooooo2 = o0ooOOo.f32218OooO00o;
        o00OO0O0.OooO0Oo(null, o0ooOOo.f32298o0000OOo, o0ooOOo.f32310o0000oOo, params, callback);
    }

    public final void getCircleInfoByDyId(@Nullable String dyId, @NotNull o00OO0O0.OooO0O0 callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        Map<String, String> params = o00OO0O0.OooO0O0();
        Intrinsics.checkNotNullExpressionValue(params, "params");
        params.put("dyid", dyId);
        o0ooOOo o0ooooo2 = o0ooOOo.f32218OooO00o;
        o00OO0O0.OooO0OO(null, o0ooOOo.f32298o0000OOo, o0ooOOo.f32323o000Ooo, params, callback);
    }

    public final void loadJoinTopic(int pageIndex, @NotNull o00OO0O0.OooO0O0 callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        Map<String, String> params = o00OO0O0.OooO0O0();
        Intrinsics.checkNotNullExpressionValue(params, "params");
        params.put("pageindex", String.valueOf(pageIndex));
        o0ooOOo o0ooooo2 = o0ooOOo.f32218OooO00o;
        o00OO0O0.OooO0OO(null, o0ooOOo.f32298o0000OOo, o0ooOOo.f32319o000O0o, params, callback);
    }
}
