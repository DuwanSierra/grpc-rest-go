// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BotanicalSpecies.proto

package com.grpc.microserviceb.grpc;

public interface BotanicalSpeciesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:net.devh.boot.grpc.example.BotanicalSpeciesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .net.devh.boot.grpc.example.BotanicalSpeciesDto species = 1;</code>
   */
  java.util.List<com.grpc.microserviceb.grpc.BotanicalSpeciesDto> 
      getSpeciesList();
  /**
   * <code>repeated .net.devh.boot.grpc.example.BotanicalSpeciesDto species = 1;</code>
   */
  com.grpc.microserviceb.grpc.BotanicalSpeciesDto getSpecies(int index);
  /**
   * <code>repeated .net.devh.boot.grpc.example.BotanicalSpeciesDto species = 1;</code>
   */
  int getSpeciesCount();
  /**
   * <code>repeated .net.devh.boot.grpc.example.BotanicalSpeciesDto species = 1;</code>
   */
  java.util.List<? extends com.grpc.microserviceb.grpc.BotanicalSpeciesDtoOrBuilder> 
      getSpeciesOrBuilderList();
  /**
   * <code>repeated .net.devh.boot.grpc.example.BotanicalSpeciesDto species = 1;</code>
   */
  com.grpc.microserviceb.grpc.BotanicalSpeciesDtoOrBuilder getSpeciesOrBuilder(
      int index);
}
