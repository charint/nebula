add_library(
    schema_obj OBJECT
    SchemaManager.cpp
    FileBasedSchemaManager.cpp
    ServerBasedSchemaManager.cpp
    NebulaSchemaProvider.cpp
)
add_dependencies(schema_obj base_obj common_thrift_obj meta_thrift_obj)


add_library(
    meta_service_handler OBJECT
    MetaServiceHandler.cpp
    MetaServiceUtils.cpp
    MetaHttpHandler.cpp
    processors/AddHostsProcessor.cpp
    processors/ListHostsProcessor.cpp
    processors/RemoveHostsProcessor.cpp
    processors/CreateSpaceProcessor.cpp
    processors/GetSpaceProcessor.cpp
    processors/ListSpacesProcessor.cpp
    processors/DropSpaceProcessor.cpp
    processors/GetPartsAllocProcessor.cpp
    processors/CreateTagProcessor.cpp
    processors/AlterTagProcessor.cpp
    processors/GetTagProcessor.cpp
    processors/ListTagsProcessor.cpp
    processors/DropTagProcessor.cpp
    processors/CreateEdgeProcessor.cpp
    processors/AlterEdgeProcessor.cpp
    processors/GetEdgeProcessor.cpp
    processors/ListEdgesProcessor.cpp
    processors/DropEdgeProcessor.cpp
    processors/GetProcessor.cpp
    processors/MultiGetProcessor.cpp
    processors/MultiPutProcessor.cpp
    processors/RemoveProcessor.cpp
    processors/RemoveRangeProcessor.cpp
    processors/ScanProcessor.cpp
    processors/HBProcessor.cpp
)
add_dependencies(
    meta_service_handler
    base_obj
    meta_thrift_obj
    common_thrift_obj
    kvstore_obj
    thread_obj
    ws_obj
    stats_obj
)


add_library(
    meta_client OBJECT
    client/MetaClient.cpp
)
add_dependencies(
    meta_client
    base_obj
    meta_thrift_obj
    common_thrift_obj
    schema_obj)


add_subdirectory(test)
