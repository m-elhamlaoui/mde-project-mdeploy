provider "aws" {
  version = "4.0"
  region = "us-west-2"
  access_key = "${var.aws_access_key}"
  secret_key = "${var.aws_access_key}"
}


variable "aws_access_key" {
  type = string
}

variable "aws_secret_key" {
  type = string
}

variable "instance_type" {
  type = string
}


resource "aws_instance" "example_server" {
  ami = "ami-0c55b159cbfafe1f0"
  instance_type = "${var.instance_type}"
  tags = {Name = 'ExampleInstance'}
}

resource "aws_s3_bucket" "example_bucket" {
  bucket = "my-terraform-bucket"
  tags = {Environment = 'Dev'}
}


output "instance_ip" {
  value = ${aws_instance.example_server.public_ip}
}

output "bucket_name" {
  value = ${aws_s3_bucket.example_bucket.id}
}

