package p589o0oOooO0;

import com.opensource.svgaplayer.entities.SVGAVideoShapeEntity;
import com.opensource.svgaplayer.proto.FrameEntity;
import com.opensource.svgaplayer.proto.SpriteEntity;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O00000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public final String f47167OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final List<o0O0000O> f47168OooO0O0;

    public o0O00000(@NotNull JSONObject jSONObject) {
        this.f47167OooO00o = jSONObject.optString("imageKey");
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("frames");
        if (jSONArrayOptJSONArray != null) {
            int length = jSONArrayOptJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    o0O0000O o0o0000o2 = new o0O0000O(jSONObjectOptJSONObject);
                    if (!o0o0000o2.f47173OooO0o0.isEmpty()) {
                        if ((((SVGAVideoShapeEntity) CollectionsKt.first((List) o0o0000o2.f47173OooO0o0)).f19438OooO00o == SVGAVideoShapeEntity.Type.keep) && arrayList.size() > 0) {
                            o0o0000o2.f47173OooO0o0 = ((o0O0000O) CollectionsKt.last((List) arrayList)).f47173OooO0o0;
                        }
                    }
                    arrayList.add(o0o0000o2);
                }
            }
        }
        this.f47168OooO0O0 = CollectionsKt.toList(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List<o0oOooO0.o0O0000O>] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList] */
    public o0O00000(@NotNull SpriteEntity spriteEntity) {
        ?? EmptyList;
        this.f47167OooO00o = spriteEntity.imageKey;
        List<FrameEntity> list = spriteEntity.frames;
        if (list != null) {
            EmptyList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            o0O0000O o0o0000o2 = null;
            for (FrameEntity it : list) {
                Intrinsics.checkExpressionValueIsNotNull(it, "it");
                o0O0000O o0o0000o3 = new o0O0000O(it);
                if (!o0o0000o3.f47173OooO0o0.isEmpty()) {
                    if ((((SVGAVideoShapeEntity) CollectionsKt.first((List) o0o0000o3.f47173OooO0o0)).f19438OooO00o == SVGAVideoShapeEntity.Type.keep) && o0o0000o2 != null) {
                        o0o0000o3.f47173OooO0o0 = o0o0000o2.f47173OooO0o0;
                    }
                }
                EmptyList.add(o0o0000o3);
                o0o0000o2 = o0o0000o3;
            }
        } else {
            EmptyList = CollectionsKt.emptyList();
        }
        this.f47168OooO0O0 = EmptyList;
    }
}
