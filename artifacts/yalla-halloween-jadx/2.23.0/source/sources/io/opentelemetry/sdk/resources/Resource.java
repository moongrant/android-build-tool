package io.opentelemetry.sdk.resources;

import com.google.auto.value.AutoValue;
import io.opentelemetry.api.common.AttributeKey;
import io.opentelemetry.api.common.Attributes;
import io.opentelemetry.api.common.AttributesBuilder;
import io.opentelemetry.api.common.OooO;
import io.opentelemetry.api.internal.InternalAttributeKeyImpl;
import io.opentelemetry.compat.BiConsumer;
import java.util.Objects;
import java.util.Properties;
import java.util.logging.Logger;
import javax.annotation.Nullable;
import javax.annotation.concurrent.Immutable;

/* JADX INFO: loaded from: classes5.dex */
@AutoValue
@Immutable
public abstract class Resource {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Logger f33438OooO00o = Logger.getLogger(Resource.class.getName());

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final Resource f33439OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final Resource f33440OooO0OO;

    static {
        Resource resourceOooO00o;
        OooO00o(OooO.OooO0O0(), null);
        f33439OooO0O0 = OooO00o(OooO.OooO0OO(ResourceAttributes.f33443OooO0OO, "unknown_service:java"), null);
        AttributesBuilder attributesBuilderOooO00o = OooO.OooO00o();
        attributesBuilderOooO00o.OooO0OO(ResourceAttributes.f33444OooO0Oo, "opentelemetry");
        attributesBuilderOooO00o.OooO0OO(ResourceAttributes.f33446OooO0o0, "java");
        InternalAttributeKeyImpl internalAttributeKeyImpl = ResourceAttributes.f33445OooO0o;
        String property = "unknown";
        Properties properties = new Properties();
        try {
            properties.load(Resource.class.getResourceAsStream("/io/opentelemetry/sdk/common/version.properties"));
            property = properties.getProperty("sdk.version", "unknown");
        } catch (Exception unused) {
        }
        attributesBuilderOooO00o.OooO0OO(internalAttributeKeyImpl, property);
        Resource resourceOooO00o2 = OooO00o(attributesBuilderOooO00o.build(), null);
        Resource resource = f33439OooO0O0;
        resource.getClass();
        AttributesBuilder attributesBuilderOooO00o2 = OooO.OooO00o();
        AutoValue_Resource autoValue_Resource = (AutoValue_Resource) resource;
        attributesBuilderOooO00o2.OooO0O0(autoValue_Resource.f33437OooO0o0);
        AutoValue_Resource autoValue_Resource2 = (AutoValue_Resource) resourceOooO00o2;
        attributesBuilderOooO00o2.OooO0O0(autoValue_Resource2.f33437OooO0o0);
        String str = autoValue_Resource.f33436OooO0Oo;
        String str2 = autoValue_Resource2.f33436OooO0Oo;
        if (str2 == null) {
            resourceOooO00o = OooO00o(attributesBuilderOooO00o2.build(), str);
        } else if (str == null) {
            resourceOooO00o = OooO00o(attributesBuilderOooO00o2.build(), str2);
        } else if (str2.equals(str)) {
            resourceOooO00o = OooO00o(attributesBuilderOooO00o2.build(), str);
        } else {
            f33438OooO00o.info("Attempting to merge Resources with different schemaUrls. The resulting Resource will have no schemaUrl assigned. Schema 1: " + str + " Schema 2: " + str2);
            resourceOooO00o = OooO00o(attributesBuilderOooO00o2.build(), null);
        }
        f33440OooO0OO = resourceOooO00o;
    }

    public static Resource OooO00o(Attributes attributes, @Nullable String str) {
        Objects.requireNonNull(attributes, "attributes");
        attributes.OooO0Oo(new BiConsumer<AttributeKey<?>, Object>() { // from class: io.opentelemetry.sdk.resources.Resource.1
            /* JADX WARN: Code duplicated, block: B:21:0x003e  */
            @Override // io.opentelemetry.compat.BiConsumer
            public final void accept(AttributeKey<?> attributeKey, Object obj) {
                boolean z;
                boolean z2;
                AttributeKey<?> attributeKey2 = attributeKey;
                Logger logger = Resource.f33438OooO00o;
                boolean z3 = false;
                if (!attributeKey2.getKey().isEmpty()) {
                    String key = attributeKey2.getKey();
                    if (key.length() <= 255) {
                        int i = 0;
                        while (true) {
                            if (i >= key.length()) {
                                z2 = true;
                                break;
                            }
                            char cCharAt = key.charAt(i);
                            if (!(cCharAt >= ' ' && cCharAt <= '~')) {
                                z2 = false;
                                break;
                            }
                            i++;
                        }
                        if (z2) {
                            z = true;
                        } else {
                            z = false;
                        }
                    } else {
                        z = false;
                    }
                    if (z) {
                        z3 = true;
                    }
                }
                if (!z3) {
                    throw new IllegalArgumentException("Attribute key should be a ASCII string with a length greater than 0 and not exceed 255 characters.");
                }
                Objects.requireNonNull(obj, "Attribute value should be a ASCII string with a length not exceed 255 characters.");
            }
        });
        return new AutoValue_Resource(attributes, str);
    }

    public abstract Attributes OooO0O0();

    @Nullable
    public abstract String OooO0OO();
}
