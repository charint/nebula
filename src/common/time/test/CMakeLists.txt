add_executable(
    duration_test
    DurationTest.cpp
    $<TARGET_OBJECTS:time_obj>
    $<TARGET_OBJECTS:thread_obj>
)
nebula_link_libraries(
    duration_test
    gtest
)
nebula_add_test(duration_test)

add_executable(
    duration_bm
    DurationBenchmark.cpp
    $<TARGET_OBJECTS:time_obj>
    $<TARGET_OBJECTS:thread_obj>
)
nebula_link_libraries(
    duration_bm
    follybenchmark
    boost_regex
)
