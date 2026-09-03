package com.amazonaws.transform;

/* JADX INFO: loaded from: classes2.dex */
public class SimpleTypeJsonUnmarshallers$StringJsonUnmarshaller implements Unmarshaller<String, JsonUnmarshallerContext> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static SimpleTypeJsonUnmarshallers$StringJsonUnmarshaller f12658OooO00o;

    public static SimpleTypeJsonUnmarshallers$StringJsonUnmarshaller OooO0O0() {
        if (f12658OooO00o == null) {
            f12658OooO00o = new SimpleTypeJsonUnmarshallers$StringJsonUnmarshaller();
        }
        return f12658OooO00o;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public final String OooO00o(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        return jsonUnmarshallerContext.f12654OooO00o.OooO0o();
    }
}
